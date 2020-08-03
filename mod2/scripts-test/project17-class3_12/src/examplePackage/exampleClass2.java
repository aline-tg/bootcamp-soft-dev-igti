//Script to learn how to work with continue 
//Created in 2020-08-02 by Aline Guerreiro
package examplePackage;

import java.util.*;

public class exampleClass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0, sum = 0, count = 0;

        do {
            System.out.println("Enter positive numbers or zero to exit");
            number = input.nextInt();

            if(number == 18)
                continue;
            sum = sum + number;
        } while (number >0);
        System.out.printf("The sum is %d.", sum);
    }
}
