package com.labs;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LunchOrderGUI extends Application {
    private final double HOT_DOG_PRICE = 2.50;
    private final double SANDWICH_PRICE = 3.50;
    private final double HAMBURGER_PRICE = 4.50;
    private final double COFFEE_PRICE = 1.25;
    private final double SODA_PRICE = 1.50;
    private final double MILK_PRICE = 1.00;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane mainLayout = new BorderPane();
        mainLayout.setPadding(new Insets(15));

        ComboBox<String> foodComboBox = new ComboBox<>();
        foodComboBox.getItems().addAll("Hot Dog", "Sandwich", "Hamburger");
        foodComboBox.setPromptText("Select a lunch item");
        mainLayout.setTop(foodComboBox);
        BorderPane.setMargin(foodComboBox, new Insets(0, 0, 10, 0));
        BorderPane.setAlignment(foodComboBox, Pos.CENTER);

        TextArea displayArea = new TextArea();
        displayArea.setEditable(false);
        displayArea.setPrefRowCount(3);
        displayArea.setPrefColumnCount(25);
        displayArea.setWrapText(true);
        mainLayout.setCenter(displayArea);
        BorderPane.setMargin(displayArea, new Insets(0, 0, 10, 10));

        ToggleGroup drinkGroup = new ToggleGroup();

        RadioButton coffeeButton = new RadioButton("Coffee");
        RadioButton sodaButton = new RadioButton("Soda");
        RadioButton milkButton = new RadioButton("Milk");

        coffeeButton.setToggleGroup(drinkGroup);
        sodaButton.setToggleGroup(drinkGroup);
        milkButton.setToggleGroup(drinkGroup);

        VBox drinkBox = new VBox(10);
        drinkBox.getChildren().addAll(coffeeButton, sodaButton, milkButton);
        drinkBox.setPadding(new Insets(0, 10, 0, 0));
        mainLayout.setLeft(drinkBox);

        Button submitButton = new Button("Submit");
        submitButton.setPrefWidth(80);
        mainLayout.setBottom(submitButton);
        BorderPane.setAlignment(submitButton, Pos.CENTER);

        submitButton.setOnAction(e -> {
            String selectedFood = foodComboBox.getValue();
            RadioButton selectedDrink = (RadioButton) drinkGroup.getSelectedToggle();

            if (selectedFood == null || selectedDrink == null) {
                displayArea.setText("Please select both a lunch item and a drink.");
                return;
            }

            double foodPrice = switch (selectedFood) {
                case "Hot Dog" -> HOT_DOG_PRICE;
                case "Sandwich" -> SANDWICH_PRICE;
                case "Hamburger" -> HAMBURGER_PRICE;
                default -> 0.0;
            };

            double drinkPrice = switch (selectedDrink.getText()) {
                case "Coffee" -> COFFEE_PRICE;
                case "Soda" -> SODA_PRICE;
                case "Milk" -> MILK_PRICE;
                default -> 0.0;
            };

            double total = foodPrice + drinkPrice;
            displayArea.setText(String.format("Total is: $%.2f", total));
        });

        Scene scene = new Scene(mainLayout, 350, 250);
        primaryStage.setTitle("Lunch Order");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}