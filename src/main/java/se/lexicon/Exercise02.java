package se.lexicon;

public class Exercise02 {

    /**
     * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
     * If the element does not exist your method should return -1 as value.
     * Expected output: Index position of number 5 is: 2.
     */
    public static void ex2() {

        int result = indexOf(300);
        System.out.println(result);

    }

    public static int indexOf(int number) {
        int[] numbers = {100, 500, 222, 300, 1000};

        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                return i;
            }
        }


        return -1;
    }


}


