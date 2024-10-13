package com.labs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class MovingBB8 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BB8Pane pane = new BB8Pane();

        // Handle key pressed events
        pane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.LEFT) {
                pane.moveLeft();
            } else if (e.getCode() == KeyCode.RIGHT) {
                pane.moveRight();
            }
        });

        Scene scene = new Scene(pane, 400, 120);
        stage.setTitle("MovingBB8");
        stage.setScene(scene);
        stage.show();

        pane.requestFocus();
    }
}

class BB8Pane extends Pane {

    // Define BB-8's circles and line
    private Circle circle1 = new Circle(200, 50, 15); // Head
    private Circle circle2 = new Circle(200, 70, 20); // Body
    private Line line = new Line(200, 25, 200, 35); // Antenna

    public BB8Pane() {
        line.setStroke(Color.BLACK);
        circle1.setFill(Color.CORAL);
        circle2.setFill(Color.CORAL);

        getChildren().addAll(circle1, circle2, line);
    }

    public void moveLeft() {
        // Move the head (circle1), body (circle2), and antenna (line) to the left
        circle1.setCenterX(circle1.getCenterX() - 10); // Move head left by 10 units
        circle2.setCenterX(circle2.getCenterX() - 10); // Move body left by 10 units
        line.setStartX(line.getStartX() - 10); // Move line start point left
        line.setEndX(line.getEndX() - 10); // Move line end point left
    }

    public void moveRight() {
        // Move the head (circle1), body (circle2), and antenna (line) to the right
        circle1.setCenterX(circle1.getCenterX() + 10); // Move head right by 10 units
        circle2.setCenterX(circle2.getCenterX() + 10); // Move body right by 10 units
        line.setStartX(line.getStartX() + 10); // Move line start point right
        line.setEndX(line.getEndX() + 10); // Move line end point right
    }
}
