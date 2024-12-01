public class ReverseArray {
    public static void main(String[] args) {
        // Declare and initialize the original array
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Print original array
        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Create reverse array
        int[] reverse = new int[numbers.length];

        // Copy elements in reverse order
        for (int i = 0; i < numbers.length; i++) {
            reverse[i] = numbers[numbers.length - 1 - i];
        }

        // Print reversed array
        System.out.println("Reversed Array:");
        for (int num : reverse) {
            System.out.print(num + " ");
        }
    }
}