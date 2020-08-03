//Script to learn how to work with break 
//Created in 2020-08-02 by Aline Guerreiro
package examplePackage;

import java.util.*;

public class exampleClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0, sum = 0;

        System.out.println("Enter a number: ");
        number = input.nextInt();

        while (number > 0) {
            sum = sum + number;

            System.out.println("Enter a number:");
            number = input.nextInt();

            if (number == 18)
                break;
        }
        System.out.printf("The sum was: %d.", sum);
    }
}
