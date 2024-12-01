public class ASCIIValue {
    public static void main(String[] args) {
        // Declare and initialize word
        String word = "Jiwan Bista";

        // Create array to store ASCII values
        int[] asciiWord = new int[word.length()];

        // Print ASCII values and store them
        System.out.println("ASCII Values:");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int asciiValue = (int) ch;
            asciiWord[i] = asciiValue;
            System.out.println("ASCII value of " + ch + " = " + asciiValue);
        }

        // Find maximum ASCII value
        int maxAsciiValue = asciiWord[0];
        int maxLocation = 0;

        for (int i = 1; i < asciiWord.length; i++) {
            if (asciiWord[i] > maxAsciiValue) {
                maxAsciiValue = asciiWord[i];
                maxLocation = i;
            }
        }

        // Print maximum ASCII value details
        System.out.println("\nMaximum ASCII value in this word is = " + maxAsciiValue);
        System.out.println("The location of the maximum ASCII value is = " + maxLocation);
        System.out.println("The maximum ASCII value character is = " + word.charAt(maxLocation));
    }
}