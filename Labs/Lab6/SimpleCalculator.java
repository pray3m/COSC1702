package com.labs;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tfResult = new TextField();
        tfResult.setEditable(false);

        Button btnAdd = new Button("Add");
        Button btnSubtract = new Button("Subtract");
        Button btnClear = new Button("Clear");

        Label lbl1 = new Label("First Operand");
        Label lbl2 = new Label("Second Operand");
        Label lblResult = new Label("Result");

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);

        pane.add(lbl1, 0, 0);
        pane.add(tf1, 1, 0);
        pane.add(lbl2, 0, 1);
        pane.add(tf2, 1, 1);
        pane.add(lblResult, 0, 2);
        pane.add(tfResult, 1, 2);
        pane.add(btnAdd, 0, 3);
        pane.add(btnSubtract, 1, 3);
        pane.add(btnClear, 2, 3);

        btnAdd.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(tf1.getText());
                double num2 = Double.parseDouble(tf2.getText());
                double sum = num1 + num2;
                tfResult.setText(String.valueOf(sum));
            } catch (NumberFormatException ex) {
                tfResult.setText("Invalid Input");
            }
        });

        btnSubtract.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(tf1.getText());
                double num2 = Double.parseDouble(tf2.getText());
                double difference = num1 - num2;
                tfResult.setText(String.valueOf(difference));
            } catch (NumberFormatException ex) {
                tfResult.setText("Invalid Input");
            }
        });

        btnClear.setOnAction(e -> {
            tf1.clear();
            tf2.clear();
            tfResult.clear();
        });

        Scene scene = new Scene(pane, 400, 200);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }
}
