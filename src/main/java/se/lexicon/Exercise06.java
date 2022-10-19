package se.lexicon;

public class Exercise06 {

    /**
     * 6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
     * Expected output: Average is: 17.3
     */
    public static void ex6() {

        double[] numbers = {43, 5, 23, 17, 2, 14};
        double sum = 0.0;

        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        System.out.println("The average of the array is " + average);

    }
}




