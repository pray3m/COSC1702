import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangle:");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();
        scanner.nextLine();

        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.print("Enter the color of the triangle: ");
        String color = scanner.nextLine();
        triangle.setColor(color);

        System.out.print("Is the triangle filled? (true/false): ");
        boolean filled = scanner.nextBoolean();
        triangle.setFilled(filled);

        System.out.println("\nTriangle Details:");
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println(triangle);

        scanner.close();
    }
}