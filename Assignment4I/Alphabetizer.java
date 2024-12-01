import java.util.Arrays;

public class Alphabetizer {
    public static void main(String[] args) {

        String longWord = "hippopotamus";

        // Convert string to char array
        char[] charArray = longWord.toCharArray();

        // Sort the characters
        Arrays.sort(charArray);

        // Convert sorted char array back to string
        String sortedWord = new String(charArray);

        System.out.println("Original Word: " + longWord);
        System.out.println("Sorted Word: " + sortedWord);
    }
}