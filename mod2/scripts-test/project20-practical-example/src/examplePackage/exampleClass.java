//Script of second practical example of module 2
//Created in 2020-08-02 by Aline Guerreiro

package examplePackage;

import java.util.Scanner;

public class exampleClass {
    public static void main(String[] args) {
        Scanner inpCharacter = new Scanner(System.in);
        Scanner inpNumbers = new Scanner(System.in);
        char operation = ' ';
        int[] numbers = new int[1000];
        int i = 0, sum = 0, evenCount = 0;
        double mean = 0;

        do {
            System.out.printf("Options Menu. \n"
                             + "D - To digit new numbers. \n"
                             + "S - To present the sum of numbers. \n"
                             + "V - To view all numbers digited. \n"
                             + "P - To get quantity of numbers digited. \n"
                             + "M - To get simple mean of digited numbers. \n"
                             + "Q - To get the quantity of even numbers. \n");
            operation = inpCharacter.nextLine().charAt(0);

            switch (operation){
                case 'D':
                    System.out.println("Enter the number: ");
                    numbers[i] = inpNumbers.nextInt();
                    i++;
                    break;
                case 'S':
                    for(int j=0; j<i; j++){
                        sum += numbers[j];
                    }
                    System.out.printf("The sum of all numbers is: %d.", sum);
                    break;
                case 'V':
                    for(int j=0; j<i; j++){
                        System.out.printf("%d.\n", numbers[j]);
                    }
                    break;
                case 'P':
                    System.out.printf("The numbers digited are %d.", i);
                    break;
                case 'M':
                    for(int j=0; j<i; j++){
                        sum += numbers[j];
                    }
                    mean = sum / (i);
                    System.out.printf("The mean numbers is: %.2f \n", mean);
                    break;
                case 'Q':
                    for(int j=0; j<i; j++){
                        if(numbers[j]%2 == 0)
                            evenCount += 1;
                    }
                    System.out.printf("We have %d. even numbers \n", evenCount);
                    break;
                case 'Y':
                    break;
                default:
                    System.out.printf("Unavailable option");
            }

        } while (operation != 'Y');
    }
}
