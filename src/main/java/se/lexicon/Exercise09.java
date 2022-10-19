package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise09 {

    /**
     * 9. Write a method which will add elements in an array.
     * Remember that arrays are fixed in size, so you need to come up with a
     * solution to “expand” the array
     */
    public static void ex9() {

        int[] array = new int[4];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 4 elements of array");
        for (int get = 0; get < array.length; get++) {
            array[get] = scan.nextInt();
        }
        System.out.println("Do you want to Enter more Values, How many more do you want to enter ");
        int more = scan.nextInt();
        if (more != 0) {
            int[] newArray = Arrays.copyOf(array, array.length + more);
            System.out.println("Enter the values");
            for (int i = array.length; i < newArray.length; i++) {
                newArray[i] = scan.nextInt();
            }
            System.out.println("Array with new values");
            for (int i = 0; i < newArray.length; i++)
                System.out.println(newArray[i]);
        } else {
            System.out.println("Array values");
            for (int i = 0; i < array.length; i++)
                System.out.println(array[i]);
        }


    }

}

