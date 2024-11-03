package Assignment3.exercise3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

public class ScoreProcessor {
    public static void main(String[] args) {
        String urlString = "http://liveexample.pearsoncmg.com/data/Scores.txt";
        ArrayList<Double> scores = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" ");
                for (String token : tokens) {
                    scores.add(Double.parseDouble(token));
                }
            }
            reader.close();

            // Calculate total and average
            double total = scores.stream().mapToDouble(Double::doubleValue).sum();
            double average = total / scores.size();

            // Sort scores in ascending order
            Collections.sort(scores);

            // Display results
            System.out.println("Scores in ascending order: " + scores);
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);

        } catch (Exception e) {
            System.out.println("Error reading from the file: " + e.getMessage());
        }
    }
}
