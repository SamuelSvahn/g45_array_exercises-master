package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {

  public static void ex11() {
    int[] arrays = new int[2];
    System.out.println("How many numbers (at least 2) do you want to add: ");
    Scanner scan = new Scanner(System.in);
    int moreNumber = scan.nextInt();
    int tmp1 = moreNumber - arrays.length;
    int tmp2 = arrays.length + tmp1;


    arrays = Arrays.copyOf(arrays, tmp2);
    int[] revArray = new int[arrays.length];
    System.out.println("Please enter your " + moreNumber + " numbers here:");
    for (int i = 0; i < arrays.length; i++) {
      arrays[i] = scan.nextInt();
    }

    int i = arrays.length - 1;
    for (int j = 0; j < revArray.length; j++) {
      revArray[j] = arrays[i];
      i--;
    }
    System.out.println("Your Numbers: ");
    System.out.println(Arrays.toString(arrays));
    System.out.println("...and your numbers in reverse: ");
    System.out.println(Arrays.toString(revArray));
  }

}