public class MyInteger {

    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(this.value);
    }

    public boolean isOdd() {
        return isOdd(this.value);
    }

    public boolean isPrime() {
        return isPrime(this.value);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInt) {
        return isEven(myInt.getValue());
    }

    public static boolean isOdd(MyInteger myInt) {
        return isOdd(myInt.getValue());
    }

    public static boolean isPrime(MyInteger myInt) {
        return isPrime(myInt.getValue());
    }

    public boolean equals(int number) {
        return this.value == number;
    }

    public boolean equals(MyInteger myInt) {
        if (myInt == null) {
            return false;
        }
        return this.value == myInt.getValue();
    }

    public static int parseInt(char[] chars) {
        int number = 0;
        for (char c : chars) {
            if (c < '0' || c > '9') {
                throw new NumberFormatException("Invalid character found: " + c);
            }
            number = number * 10 + (c - '0');
        }
        return number;
    }

    public static int parseInt(String str) {
        if (str == null || str.isEmpty()) {
            throw new NumberFormatException("String is null or empty");
        }
        int number = 0;
        for (char c : str.toCharArray()) {
            if (c < '0' || c > '9') {
                throw new NumberFormatException("Invalid character found: " + c);
            }
            number = number * 10 + (c - '0');
        }
        return number;
    }
}
