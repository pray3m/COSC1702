package Assignment4II.Exercise3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MouseInsideRectangle extends Application {
    private Rectangle rectangle;
    private Label messageLabel;

    @Override
    public void start(Stage primaryStage) {
        // Create the rectangle
        rectangle = new Rectangle(80 - 50, 50 - 15, 100, 30);
        rectangle.setFill(Color.TRANSPARENT);
        rectangle.setStroke(Color.BLACK);

        messageLabel = new Label();
        messageLabel.setTranslateX(10);
        messageLabel.setTranslateY(10);

        Pane root = new Pane(rectangle, messageLabel);

        root.setOnMouseMoved(this::handleMouseMoved);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Mouse Inside Rectangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleMouseMoved(MouseEvent event) {
        double mouseX = event.getX();
        double mouseY = event.getY();

        if (rectangle.contains(mouseX, mouseY)) {
            messageLabel.setText("Mouse point is inside the rectangle");
        } else {
            messageLabel.setText("Mouse point is outside the rectangle");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}