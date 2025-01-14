package Lab11;

import java.util.*;

public class Lab11 {

    // Generic method to print an array in reverse order
    public static <T> void printArrayInReverse(T[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer Array in Reverse:");
        printArrayInReverse(intArray);

        // Double array
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("Double Array in Reverse:");
        printArrayInReverse(doubleArray);

        // Character array
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("Character Array in Reverse:");
        printArrayInReverse(charArray);
    }
}
