/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W4HW;

import java.util.Scanner;

/**
 *
 * @author Lisa
 */
public class NumberListDemo {

    public static int displaySum;
    public static int displayAverage;
    public static int displayLowestValue;
    public static int displayHighestValue;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numberListArray = new int[8];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numberListArray.length; i++) {
            System.out.print("Give me an integer: ");
            numberListArray[i] = input.nextInt();
        }
        displayArray(numberListArray);
        displayArrayReverse(numberListArray);
        displayArraySum(numberListArray);
        displayArrayLessThan5(numberListArray);
        displayArrayLowestValue(numberListArray);
        displayArrayHighestValue(numberListArray);
        displayArrayAverage(numberListArray);
        displayArrayValuesHigherThanAverage(numberListArray);
    }

    public static void displayArray(int[] numberListArray) {
        System.out.print("The FULL array: ");
        for (int i = 0; i < numberListArray.length; i++) {
            System.out.print(numberListArray[i] + " ");
        }
        System.out.println();
    }

    public static void displayArrayReverse(int[] numberListArray) {
        System.out.print("The REVERSE is: ");
        for (int i = 7; i >= 0; i--) {
            System.out.print(numberListArray[i] + " ");
        }
        System.out.println();
    }

    public static void displayArraySum(int[] numberListArray) {
        System.out.print("The SUM is: ");
        for (int i = 0; i < numberListArray.length; i++) {
            displaySum += numberListArray[i];
        }
        System.out.print(displaySum);
        System.out.println();
    }

    public static void displayArrayLessThan5(int[] numberListArray) {
        System.out.print("The NUMBERS LESS THAN 5 are: ");
        for (int i = 0; i < numberListArray.length; i++) {
            if (numberListArray[i] < 5) {
                System.out.print(numberListArray[i] + " ");
            }
        }
        System.out.println();
    }

    public static void displayArrayLowestValue(int[] numberListArray) {
        displayLowestValue = numberListArray[0];
        System.out.print("The LOWEST VALUE is: ");
        for (int i = 0; i < numberListArray.length; i++) {
            displayLowestValue = Math.min(numberListArray[i], displayLowestValue);
        }
        System.out.println(displayLowestValue);
    }

    public static void displayArrayHighestValue(int[] numberListArray) {
        displayHighestValue = numberListArray[0];
        System.out.print("The HIGHEST VALUE is: ");
        for (int i = 0; i < numberListArray.length; i++) {
            displayHighestValue = Math.max(numberListArray[i], displayHighestValue);
        }
        System.out.println(displayHighestValue);
    }

    public static void displayArrayAverage(int[] numberListArray) {
        System.out.print("The AVERAGE is: ");
        displayAverage = displaySum / numberListArray.length;

        System.out.print(displayAverage);
        System.out.println();
    }

    public static void displayArrayValuesHigherThanAverage(int[] numberListArray) {
        System.out.print("The VALUES HIGHER THAN THE AVERAGE VALUES are: ");
        for (int i = 0; i < numberListArray.length; i++) {
            if (numberListArray[i] > displayAverage) {
                System.out.print(numberListArray[i] + " ");
            }
        }
        System.out.println();
    }
}
