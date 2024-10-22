package Labs.Lab8;

import java.io.*;
import java.util.Date;
import java.util.TimeZone;
import java.util.Arrays;

public class DateNumberFileIO {
    public static void main(String[] args) {

        TimeZone canadaTimeZone = TimeZone.getTimeZone("America/Toronto");
        TimeZone.setDefault(canadaTimeZone);

        // Write data to file
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("file1.dat"))) {

            // Write current date as long
            Date currentDate = new Date();
            output.writeLong(currentDate.getTime());

            // Write double value 2.5
            output.writeDouble(2.5);

            // Write array of 5 integers
            int[] numbers = { 1, 2, 3, 4, 5 };
            for (int number : numbers) {
                output.writeInt(number);
            }

            System.out.println("Data has been written to file1.dat");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read data from file
        try (DataInputStream input = new DataInputStream(new FileInputStream("file1.dat"))) {

            // Read and display date
            Date storedDate = new Date(input.readLong());
            System.out.println("Stored date: " + storedDate);

            // Read and display double
            double storedDouble = input.readDouble();
            System.out.println("Stored double: " + storedDouble);

            // Read and display array
            int[] storedNumbers = new int[5];
            System.out.print("Stored array: ");
            for (int i = 0; i < storedNumbers.length; i++) {
                storedNumbers[i] = input.readInt();
            }
            System.out.println(Arrays.toString(storedNumbers));

        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}