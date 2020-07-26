//Script of first practical example from module 2 in Java
//Created in 2020-07-26 by Aline Guerreiro

package package02;

import java.util.Scanner;

public class class02 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0, aux = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n1 value: ");
        n1 = input.nextInt();
        n2 = 30;

        if(n1 == 20)
            aux = n1 * 5;
        else if (n1 > 20)
            aux = n1 * 6; //10-4 ??
        else
            aux = n2;
        System.out.printf("The variable value aux is: %d. Final n1: %d and final n2: %d", aux, n1,n2);
    }
}
