package Assignment3.exercise2;

import java.util.Scanner;

public class TestTriangleWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter side1: ");
            double side1 = input.nextDouble();
            System.out.print("Enter side2: ");
            double side2 = input.nextDouble();
            System.out.print("Enter side3: ");
            double side3 = input.nextDouble();

            System.out.print("Enter color: ");
            String color = input.next();
            System.out.print("Is the triangle filled (true/false): ");
            boolean filled = input.nextBoolean();

            Triangle triangle = new Triangle(side1, side2, side3, color, filled);

            System.out.println("Triangle details:");
            System.out.println(triangle.toString());
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());
            System.out.println("Color: " + triangle.getColor());
            System.out.println("Filled: " + triangle.isFilled());
        } catch (IllegalTriangleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}