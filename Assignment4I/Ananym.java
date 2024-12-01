public class Ananym {
    public static void main(String[] args) {
        // Declare and initialize name
        String name = "Jiwan";

        // Create ananym
        String ananym = "";

        // Reverse the characters
        for (int i = name.length() - 1; i >= 0; i--) {
            ananym += name.charAt(i);
        }

        // Print original name and ananym
        System.out.println("Original Name: " + name);
        System.out.println("Ananym: " + ananym);
    }
}