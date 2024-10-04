import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        // Calculate discriminant
        double discriminant = equation.getDiscriminant();

        System.out.println("\nThe quadratic equation is: " + a + "x² + " + b + "x + " + c + " = 0");
        System.out.println("Discriminant: " + discriminant);

        // Determine the roots based on discriminant
        if (discriminant > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("The equation has two roots: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = equation.getRoot1(); // Both roots are same
            System.out.println("The equation has one root: " + root);
        } else {
            System.out.println("The equation has no roots.");
        }

        scanner.close();
    }
}
