public class TestProgram {
    public static void main(String[] args) {

        MyStringBuilder1 sb1 = new MyStringBuilder1("Hello");
        MyStringBuilder1 sb2 = new MyStringBuilder1("World");
        MyStringBuilder1 sb3 = new MyStringBuilder1("123");

        sb1.append(sb2);
        System.out.println("After appending sb2 to sb1: " + sb1.toString());

        sb1.append(2024);
        System.out.println("After appending 2024 to sb1: " + sb1.toString());

        System.out.println("Length of sb1: " + sb1.length());

        System.out.println("Character at index 5 of sb1: " + sb1.charAt(5));

        sb1.toLowerCase();
        System.out.println("After converting sb1 to lowercase: " + sb1.toString());

        MyStringBuilder1 sb4 = sb1.substring(5, 10);
        System.out.println("Substring of sb1 from index 5 to 10: " + sb4.toString());
    }
}
