package img;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LabelImageFlowPane extends Application {
    @Override
    public void start(Stage primaryStage) {

        FlowPane flowPane = new FlowPane();

        Label label1 = new Label("Swift");
        label1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));

        Label label2 = new Label("C++");
        label2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));

        Label label3 = new Label("Java");
        label3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));

        Image image1 = new Image("file:img/swift.png");
        ImageView imageView1 = new ImageView(image1);

        Image image2 = new Image("file:img/cpp.png");
        ImageView imageView2 = new ImageView(image2);

        Image image3 = new Image("file:img/java.png");
        ImageView imageView3 = new ImageView(image3);

        flowPane.getChildren().addAll(label1, imageView1, label2, imageView2, label3, imageView3);

        Scene scene = new Scene(flowPane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Programming Language");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
