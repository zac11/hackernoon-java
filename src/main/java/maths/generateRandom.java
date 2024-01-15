package maths;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class generateRandom {
    /**
     * Generate random numbers between 0 and 1 - each number should have 3 decimal place
     */


    public static void generateRandoms(int range){
        Random random = new Random();
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        for(int i=0;i< range;i++){
            double randomNumber = random.nextDouble();
            String formattedNumber = decimalFormat.format(randomNumber);

            System.out.println("Random number between 0 and 1: " + formattedNumber);
        }

    }

    public static void generateRandomApproach2() {
        ArrayList<Double> al = new <Double>ArrayList(); // al is ArrayList object
// for iteration
        for (int i = 0; i <= 5; i++) {
            al.add(Math.random());
        }

        Iterator i = al.iterator();
        while (i.hasNext()) {
            System.out.printf("%.3f", i.next()); // To pick the number till 3 decimal points
            System.out.println();
        }
    }

    public static void main(String [] args){
        generateRandoms(5);
        generateRandomApproach2();
    }
}
