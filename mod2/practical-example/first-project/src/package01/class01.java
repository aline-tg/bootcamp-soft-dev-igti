//Script of first practical example from module 2 in Java
//Created in 2020-07-26 by Aline Guerreiro

package package01;

import java.util.Scanner;

public class class01 {
    public static void main(String[] args) {
        int n1 = 0;
        boolean results;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        n1 = input.nextInt();
        
        results = (n1 % 2 == 0); //boolean operation
        System.out.printf("Results: %b, n1: %d ", results, n1);
    }
}
