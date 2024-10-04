public class TestMyInteger {
    public static void main(String[] args) {
       
        MyInteger myInt1 = new MyInteger(17);
        MyInteger myInt2 = new MyInteger(20);
        MyInteger myInt3 = new MyInteger(17);

        // Test isEven(), isOdd(), isPrime()
        System.out.println("Testing isEven(), isOdd(), isPrime() methods:");
        System.out.println("myInt1 value: " + myInt1.getValue());
        System.out.println("Is Even? " + myInt1.isEven());
        System.out.println("Is Odd? " + myInt1.isOdd());
        System.out.println("Is Prime? " + myInt1.isPrime());
        System.out.println();

        System.out.println("myInt2 value: " + myInt2.getValue());
        System.out.println("Is Even? " + myInt2.isEven());
        System.out.println("Is Odd? " + myInt2.isOdd());
        System.out.println("Is Prime? " + myInt2.isPrime());
        System.out.println();

        // Test static isEven(int), isOdd(int), isPrime(int)
        System.out.println("Testing static isEven(int), isOdd(int), isPrime(int) methods:");
        int number = 11;
        System.out.println("Number: " + number);
        System.out.println("Is Even? " + MyInteger.isEven(number));
        System.out.println("Is Odd? " + MyInteger.isOdd(number));
        System.out.println("Is Prime? " + MyInteger.isPrime(number));
        System.out.println();

        // Test static isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger)
        System.out.println("Testing static isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger) methods:");
        System.out.println("myInt3 value: " + myInt3.getValue());
        System.out.println("Is Even? " + MyInteger.isEven(myInt3));
        System.out.println("Is Odd? " + MyInteger.isOdd(myInt3));
        System.out.println("Is Prime? " + MyInteger.isPrime(myInt3));
        System.out.println();

        // Test equals(int) and equals(MyInteger)
        System.out.println("Testing equals(int) and equals(MyInteger) methods:");
        System.out.println("myInt1 equals 17? " + myInt1.equals(17));
        System.out.println("myInt1 equals myInt2? " + myInt1.equals(myInt2));
        System.out.println("myInt1 equals myInt3? " + myInt1.equals(myInt3));
        System.out.println();

        // Test parseInt(char[]) and parseInt(String)
        System.out.println("Testing parseInt(char[]) and parseInt(String) methods:");
        char[] numericChars = { '1', '2', '3', '4' };
        String numericString = "5678";

        System.out.println("Parsing char array {'1','2','3','4'}: " + MyInteger.parseInt(numericChars));
        System.out.println("Parsing string \"5678\": " + MyInteger.parseInt(numericString));
        System.out.println();
    }
}
