public class PalindromeChecker {
    public static void main(String[] args) {
        String[] words = { "rotor", "madam", "racecar", "hello", "world" };

        for (String word : words) {
            // Create ananym
            String ananym = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                ananym += word.charAt(i);
            }

            // Check if palindrome
            boolean isPalindrome = word.equals(ananym);

            // Print results
            System.out.println("Word: " + word);
            System.out.println("Ananym: " + ananym);
            System.out.println("Is Palindrome? " + isPalindrome);
            System.out.println();
        }
    }
}