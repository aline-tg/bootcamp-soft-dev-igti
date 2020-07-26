//Script of first practical example from module 2 in Java
//Created in 2020-07-26 by Aline Guerreiro

package package03;

import java.util.Scanner;

public class class03 {
    public static void main(String[] args) {
        double fixedSalary = 1500.00, comission = 0.05, numberOfSale = 0, totalSalary = 0;
        double childCareAssistence = 350.00;

        Scanner textInput = new Scanner(System.in);
        Scanner doubleInput = new Scanner(System.in);

        String name;
        char hasChild;

        System.out.println("Enter the salesman name: ");
        name = textInput.nextLine();

        System.out.println("Has the salesman childs? Y or N");
        hasChild = textInput.nextLine().charAt(0);

        System.out.println("Enter the number of sales:");
        numberOfSale = doubleInput.nextDouble();

        if (numberOfSale >= 20000.00){
            if(hasChild == 'Y' || hasChild == 'y')
                totalSalary = fixedSalary + (numberOfSale*comission) + childCareAssistence;
            else
                totalSalary = fixedSalary + (numberOfSale * comission);        
            }
        else {
            if(hasChild == 'Y' || hasChild == 'y')
                totalSalary = fixedSalary + childCareAssistence;
            else
                totalSalary = fixedSalary;
        }
        System.out.printf("The salary for salesman %s is %.2f", name, totalSalary);    
    }
}
