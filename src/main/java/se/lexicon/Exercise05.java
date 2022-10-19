package se.lexicon;

public class Exercise05 {

    /**
     * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
     * Expected output:
     * France Paris
     * Sweden Stockholm
     */
    public static void ex5() {

        String[][] Country = new String[2][2];

        Country[0][0] = "France";
        Country[0][1] = "Paris";
        Country[1][0] = "Sweden";
        Country[1][1] = "Stockholm";

        for (int i = 0; i < Country.length; i++) {

            for (int j = 0; j < Country[i].length; j++) {
                System.out.print(Country[i][j] + "\t");
            }
            System.out.println("\n");


        }

    }

}
