//Script to learn how to work with while loops
//Created in 2020-08-02 by Aline Guerreiro
package examplePackage;

import java.util.Scanner;

public class exampleClass {
    public static void main(String[] args) {
    
        char output = 'N';
        int number = 0, sum = 0, numbersCount = 0;

        Scanner input = new Scanner(System.in);

        while (output!= 'Y'){
            System.out.println("Enter a number: ");
            number = input.nextInt();
            input.nextLine();
            System.out.println("Would you like to exit ? Y - yes, N- No");
            output = input.nextLine().charAt(0);
            sum = sum + number;
            numbersCount++;
        }
        System.out.printf("The sum is: %d.", sum);
    }
}
