import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class SmileyFace extends Application {
    @Override
    public void start(Stage primaryStage) {
    
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        drawSmileyFace(gc);

        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Smiley Face");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawSmileyFace(GraphicsContext gc) {
        // Face outline
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.strokeOval(50, 50, 300, 300);

        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.strokeOval(115, 115, 70, 70); 
        gc.strokeOval(215, 115, 70, 70); 

        // Eyes
        gc.setFill(Color.BLACK);
        gc.fillOval(130, 130, 40, 40); // Left eye
        gc.fillOval(230, 130, 40, 40); // Right eye

        // Nose (triangle)
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        double[] xPoints = { 200, 180, 220 };
        double[] yPoints = { 180, 240, 240 };
        gc.strokePolygon(xPoints, yPoints, 3); 

        // Mouth
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.strokeArc(150, 250, 100, 50, 0, -180, ArcType.OPEN); // Simple arc for the mouth
    }

    public static void main(String[] args) {
        launch(args);
    }
}
