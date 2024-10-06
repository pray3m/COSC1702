import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Random;
import java.io.IOException;

public class TestTriangle {
    public static void main(String[] args) {
        // Create sides.txt with three random integers between 1 and 10
        try (FileWriter fileWriter = new FileWriter("sides.txt")) {
            Random random = new Random();
            for (int i = 0; i < 3; i++) {
                int side = random.nextInt(10) + 1;
                fileWriter.write(side + "\n");
            }
            System.out.println("sides.txt created with three random sides.");
        } catch (IOException e) {
            System.out.println("Error writing to sides.txt: " + e.getMessage());
            return;
        }

        // Read the three integers from sides.txt
        double side1, side2, side3;
        try (BufferedReader br = new BufferedReader(new FileReader("sides.txt"))) {
            String line;

            line = br.readLine();
            if (line != null) {
                side1 = Double.parseDouble(line.trim());
            } else {
                throw new IOException("sides.txt does not contain enough sides.");
            }

            line = br.readLine();
            if (line != null) {
                side2 = Double.parseDouble(line.trim());
            } else {
                throw new IOException("sides.txt does not contain enough sides.");
            }

            line = br.readLine();
            if (line != null) {
                side3 = Double.parseDouble(line.trim());
            } else {
                throw new IOException("sides.txt does not contain enough sides.");
            }

            System.out.println("Sides read from sides.txt: " + side1 + ", " + side2 + ", " + side3);
        } catch (IOException e) {
            System.out.println("Error reading from sides.txt: " + e.getMessage());
            return;
        }

        // Attempt to create a Triangle object
        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Triangle created successfully:");

        } catch (IllegalTriangleException e) {

            System.out.println("IllegalTriangleException: " + e.getMessage());
        }
    }
}
