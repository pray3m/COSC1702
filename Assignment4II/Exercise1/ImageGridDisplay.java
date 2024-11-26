package Assignment4II.Exercise1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageGridDisplay extends Application {

    @Override
    public void start(Stage primaryStage) {

        String imagePath1 = "/Users/pray3m/Documents/Jiwan-Bista/IdeaProjects/assignment4/src/main/java/com/example/assignment4/flag1.jpg";
        String imagePath2 = "/Users/pray3m/Documents/Jiwan-Bista/IdeaProjects/assignment4/src/main/java/com/example/assignment4/flag2.jpg";
        String imagePath3 = "/Users/pray3m/Documents/Jiwan-Bista/IdeaProjects/assignment4/src/main/java/com/example/assignment4/flag3.jpg";
        String imagePath4 = "/Users/pray3m/Documents/Jiwan-Bista/IdeaProjects/assignment4/src/main/java/com/example/assignment4/flag4.jpg";


        Image image1 = new Image("file:" + imagePath1);
        Image image2 = new Image("file:" + imagePath2);
        Image image3 = new Image("file:" + imagePath3);
        Image image4 = new Image("file:" + imagePath4);


        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);


        imageView1.setFitWidth(200);
        imageView1.setFitHeight(150);
        imageView1.setPreserveRatio(true);

        imageView2.setFitWidth(200);
        imageView2.setFitHeight(150);
        imageView2.setPreserveRatio(true);

        imageView3.setFitWidth(200);
        imageView3.setFitHeight(150);
        imageView3.setPreserveRatio(true);

        imageView4.setFitWidth(200);
        imageView4.setFitHeight(150);
        imageView4.setPreserveRatio(true);


        GridPane gridPane = new GridPane();
        gridPane.add(imageView1, 0, 0); // Image 1 at (0,0)
        gridPane.add(imageView2, 1, 0); // Image 2 at (1,0)
        gridPane.add(imageView3, 0, 1); // Image 3 at (0,1)
        gridPane.add(imageView4, 1, 1); // Image 4 at (1,1)


        gridPane.setHgap(10);
        gridPane.setVgap(10);


        Scene scene = new Scene(gridPane, 450, 350);


        primaryStage.setTitle("JavaFX Grid Layout");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
