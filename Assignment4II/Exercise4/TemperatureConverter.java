package Assignment4II.Exercise4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TemperatureConverter extends Application {
    private TextField celsiusField;
    private TextField fahrenheitField;

    @Override
    public void start(Stage primaryStage) {
        celsiusField = new TextField();
        celsiusField.setPromptText("Celsius");
        celsiusField.setOnAction(event -> convertTemperature(celsiusField, fahrenheitField));

        fahrenheitField = new TextField();
        fahrenheitField.setPromptText("Fahrenheit");
        fahrenheitField.setOnAction(event -> convertTemperature(fahrenheitField, celsiusField));

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(new Label("Celsius"), 0, 0);
        grid.add(celsiusField, 1, 0);
        grid.add(new Label("Fahrenheit"), 0, 1);
        grid.add(fahrenheitField, 1, 1);

        Scene scene = new Scene(grid, 300, 100);
        primaryStage.setTitle("Temperature Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void convertTemperature(TextField inputField, TextField outputField) {
        try {
            double inputValue = Double.parseDouble(inputField.getText());
            double outputValue;

            if (inputField == celsiusField) {
                outputValue = (inputValue * 9.0 / 5.0) + 32.0;
                outputField.setText(String.format("%.1f", outputValue));
            } else {
                outputValue = (inputValue - 32.0) * 5.0 / 9.0;
                outputField.setText(String.format("%.1f", outputValue));
            }
        } catch (NumberFormatException e) {
            outputField.setText("");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}