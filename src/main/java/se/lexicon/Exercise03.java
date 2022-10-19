package se.lexicon;

import java.util.Arrays;

public class Exercise03 {

    /**
     * 3. Write a program which will sort string array.
     * Expected output:
     * String array: [Paris, London, New York, Stockholm]
     * Sort string array: [London, New York, Paris, Stockholm]
     */
    public static void ex3() {


        String[] cities = {"Paris", "Stockholm", "London", "New York",};
        Arrays.sort(cities);
        for (String name : cities) {
            System.out.println(name);

        }
    }


}

