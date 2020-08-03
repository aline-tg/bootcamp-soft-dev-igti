//Script to learn how to work with do-while loops
//Created in 2020-08-02 by Aline Guerreiro
package examplePackage;

import java.util.Scanner;

public class exampleClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char continueV = ' ';
        System.out.println("Do you want to continue? Y- yes, N-No");
        continueV = input.nextLine().charAt(0);

        do {
            System.out.println("Message");
        } while (continueV == 'Y');
    }
}
