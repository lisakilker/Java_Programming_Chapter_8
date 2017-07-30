/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W4HW;

import java.util.Scanner;
//import javax.swing.JOptionPane;

/**
 *
 * @author Lisa
 */
public class PhoneBook {

    public static String searchName;
    public static String searchNumber;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = new String[20];
        String[] phoneNumbers = new String[20];
        int i;
        int j;

        Scanner input = new Scanner(System.in);

        for (i = 0; i < names.length; i++) {
            System.out.print("Enter a friend's name or zzz to quit? ");
            names[i] = input.nextLine();

            if (names[i].equalsIgnoreCase("zzz")) {
                System.out.println("Done");
                break;
            }
        }
        System.out.println("You entered " + i + " names.");

        for (j = 0; j < phoneNumbers.length; j++) {
            System.out.print("What is the phone number for " + names[j] + "? ");
            phoneNumbers[j] = input.nextLine();
        }

        System.out.println("Your Phonebook: ");
        for (int k = 0; k < names.length; k++) {
            System.out.println(names[k] + " ");
        }
        System.out.print("Give me a name: ");
        searchName = input.nextLine();

        for (int m = 0; m < names.length; m++) {
            if (names[m].equals(searchName)) {
                System.out.println(names[m] + "'s phone number is:  " + phoneNumbers[m]);
            }
        }
    }
}
