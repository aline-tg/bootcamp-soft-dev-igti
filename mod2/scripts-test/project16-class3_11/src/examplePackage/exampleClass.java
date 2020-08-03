//Script to learn how to work with arrays
//Created in 2020-08-02 by Aline Guerreiro
package examplePackage;

import java.util.*;

public class exampleClass {
    public static void main(String[] args) {
        //type[] nameVal= new type[size];
        int[] numbers = new int[5];
        int total = 0, i =0;

        Scanner input = new Scanner(System.in);

        for (i=0; i< 5; i++){
            System.out.printf("Enter %d. number: ", i+1);
            numbers[i]=input.nextInt();
            total += numbers[i];
            System.out.printf("Partial total is: %d. /n", total);
        }
        System.out.printf("The total value is: %d.",total);
    }
}
