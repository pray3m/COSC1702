package Labs.Lab8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.*;

public class StudentGradesGUI extends Application {
    private TextArea textArea;

    @Override
    public void start(Stage primaryStage) {
        // Create main layout
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        root.setAlignment(Pos.CENTER);

        // Create label
        Label label = new Label("Enter the data");

        // Create text area
        textArea = new TextArea();
        textArea.setPrefRowCount(10);
        textArea.setPrefColumnCount(30);
        textArea.setWrapText(true);

        // Create button
        Button saveButton = new Button("Save to File");
        saveButton.setOnAction(e -> saveData());

        // Add components to layout
        root.getChildren().addAll(label, textArea, saveButton);

        // Create scene
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Student Grades");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void saveData() {
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("grades.dat"))) {

            String[] lines = textArea.getText().trim().split("\n");
            double sum = 0;
            int count = 0;

            // Process each line
            for (String line : lines) {
                String[] parts = line.trim().split("\\s+");
                if (parts.length >= 2) {
                    // Write student name
                    output.writeUTF(parts[0]);

                    // Write grade
                    int grade = Integer.parseInt(parts[parts.length - 1]);
                    output.writeInt(grade);

                    sum += grade;
                    count++;
                }
            }

            // Calculate and write average
            double average = count > 0 ? sum / count : 0;
            output.writeDouble(average);

            // Show confirmation
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Data saved successfully!");
            alert.showAndWait();

        } catch (IOException | NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Error saving data: " + e.getMessage());
            alert.showAndWait();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}