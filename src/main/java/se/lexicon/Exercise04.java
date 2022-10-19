package se.lexicon;

public class Exercise04 {

    /**
     * 4. Write a program which will copy the elements of one array into another array.
     * Expected output:
     * Elements from first array: 1 15 20
     * Elements from second array: 1 15 20
     */
    public static void ex4() {

        char[] letters = {'S', 'A', 'M', 'U', 'E', 'L'};
        char[] copyOfArray = letters;

        for (char c : letters) {
            System.out.println(c);
        }
        System.out.println("---------------");

        for (char c : copyOfArray) {
            System.out.println(c);
        }

    }

}
