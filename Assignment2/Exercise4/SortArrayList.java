import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {

    public static void sort(ArrayList<Integer> list) {
        int n = list.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (list.get(j) > list.get(j + 1)) {

                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        System.out.println("Enter five integers to sort:");

        // Prompt the user to enter five numbers
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            // Validate input to ensure it's an integer
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                System.out.print("Enter number " + i + ": ");
                scanner.next(); // Clear invalid input
            }
            int number = scanner.nextInt();
            numberList.add(number);
        }

        // Display the original list
        System.out.println("\nOriginal list:");
        System.out.println(numberList);

        sort(numberList);

        // Display the sorted list
        System.out.println("\nSorted list in increasing order:");
        System.out.println(numberList);

        scanner.close();
    }
}
