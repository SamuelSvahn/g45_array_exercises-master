package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {

  static String[] initArray = new String[0];
  public static void ex11() {
    int userInput = getUserInput();
    initArray = addNumberToArray(initArray, userInput);
    addMoreNumber(initArray);
    printArray(initArray);
    reverseArray(initArray,initArray.length);
  }


  public static int getUserInput () {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the numbers press 0 to see result: ");

    int userInput = scanner.nextInt();
    return userInput;
  }

  public static String[] addNumberToArray (String[] originArray, int newNumber) {
    String[] newArray = Arrays.copyOf(originArray, originArray.length + 1);
    newArray[newArray.length - 1] = String.valueOf(newNumber);
    return newArray;
  }


  public static String[] addMoreNumber (String[] arrays) {
    boolean userContinue = true;
    while (userContinue) {
      int userInput = getUserInput();
      initArray = addNumberToArray(initArray, userInput);
      if (userInput == 0) {
        break;
      } else userContinue = true;
    }
    return arrays;
  }

  public static String[] printArray(String[] array) {
    System.out.println("Array: ");
    for (int i = 0; i < array.length-1; i++) {
      System.out.println(array[i]);
    }
    return array;
  }

  public static String[] reverseArray(String[] array, int n) {
    String[] newArray = new String[n];
    int j = n;
    for (int i = 0; i < n; i++) {
      newArray[j-1] = array[i];
      j = j - 1;
    }
    System.out.println("Reverse array: ");
    for (int k = 1; k < n; k++) {
      System.out.println(newArray[k]);
    }
    return array;
  }
}