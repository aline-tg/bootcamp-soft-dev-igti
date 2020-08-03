//Script to learn how to work with switch conditional in Java
//Created in 2020-08-01 by Aline Guerreiro
package examplePackage;

import java.util.Scanner;

public class exampleClass {
    public static void main(String[] args) {
        char operation = ' ';
        double n1 = 0, n2 = 0, total = 0; 
        Scanner ent = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        n1 = ent.nextInt();

        System.out.println("Enter the second number: ");
        n2 = ent.nextInt();

        ent.nextLine();
        System.out.println("Enter the operation (+,-,/,*,%):  ");
        operation = ent.nextLine().charAt(0);

        switch (operation){
            case '+':
                total = n1 + n2;
                break;
            case '-':
                total = n1 - n2;
                break;
            case '/':
                total = n1 / n2;
                break;
            case '*':
                total = n1 * n2;
                break;
            case '%':
                total = n1 % n2;
                break;
            default:
                System.out.println("Unknow Operation...");               
        }

        if(operation == '+' || operation == '-' || 
            operation == '/' || operation == '*' || 
            operation == '%')
        System.out.printf("%.2f %c %.2f = %.2f", n1, operation, n2, total);
    }
}
