//Script of first interactive class example from module 2 in Java
//Created in 2020-07-27 by Aline Guerreiro

package pkgInteractiveClass;

import java.util.*;

public class calculatorClass {
    public static void main(String[] args) {
        double n1=0, n2=0, total=0;
        Scanner input = new Scanner(System.in);
        char operation;

        System.out.println("Enter the value of first term:");
        n1 = input.nextDouble();

        System.out.println("Enter the value of second term:");
        n2 = input.nextDouble();
        
        input.nextLine();

        System.out.println("Enter the operation (+, -, *, %):");

        operation = input.nextLine().charAt(0);

        if (operation == '+')
            total = n1 - n2;
        else if (operation == '-')
            total = n1-n2;
        else if (operation == '/')
            total = n1/n2;
        else if (operation == '*')
            total = n1*n2;
        else if (operation == '%')
            total = n1%n2;
        System.out.printf("%.2f %c %.2f = %.2f.", n1, operation, n2, total);

    }
}
