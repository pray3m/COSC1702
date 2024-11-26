package Assignment4II.Exercise2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {

    @Override
    public void start(Stage primaryStage) {

        TextField num1Field = new TextField();
        TextField num2Field = new TextField();
        TextField resultField = new TextField();
        resultField.setEditable(false);

        Button addButton = new Button("Add");
        Button subtractButton = new Button("Subtract");
        Button multiplyButton = new Button("Multiply");
        Button divideButton = new Button("Divide");

        addButton.setOnAction(e -> performOperation(num1Field, num2Field, resultField, "add"));
        subtractButton.setOnAction(e -> performOperation(num1Field, num2Field, resultField, "subtract"));
        multiplyButton.setOnAction(e -> performOperation(num1Field, num2Field, resultField, "multiply"));
        divideButton.setOnAction(e -> performOperation(num1Field, num2Field, resultField, "divide"));

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setAlignment(Pos.CENTER);

        grid.add(new Label("Number 1:"), 0, 0);
        grid.add(num1Field, 1, 0);
        grid.add(new Label("Number 2:"), 0, 1);
        grid.add(num2Field, 1, 1);
        grid.add(new Label("Result:"), 0, 2);
        grid.add(resultField, 1, 2);

        grid.add(addButton, 0, 3);
        grid.add(subtractButton, 1, 3);
        grid.add(multiplyButton, 0, 4);
        grid.add(divideButton, 1, 4);

        Scene scene = new Scene(grid, 300, 250);
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void performOperation(TextField num1Field, TextField num2Field, TextField resultField, String operation) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;
            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "subtract":
                    result = num1 - num2;
                    break;
                case "multiply":
                    result = num1 * num2;
                    break;
                case "divide":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        resultField.setText("Cannot divide by zero");
                        return;
                    }
                    break;
            }
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            resultField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
