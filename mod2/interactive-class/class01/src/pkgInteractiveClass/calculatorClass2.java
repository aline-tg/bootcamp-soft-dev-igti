//Script of first interactive class example from module 2 in Java
//Created in 2020-07-27 by Aline Guerreiro

package pkgInteractiveClass;

import java.util.*;

public class calculatorClass {
    public static void main(String[] args) {
        int year=0, age=9;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the year of your born: ");
        year = in.nextInt();
        age= 2020- year;

        if (age>=16)
            System.out.printf("%d years old you can vote. \n", age);
        else
            System.out.printf("%d years old you cannot vote. \n", age); 
        
        if(age>=18)
            System.out.printf("%d years old you can drive. \n", age);
        else
            System.out.printf("%d years old you cannot drive. \n", age);

        if (age >=0 && age <12)
            System.out.println("You are just a kid!");
        else if (age>= 12 && age <=18)
            System.out.println("You are just a teenage!");
        else if (age>= 18 && age <60)
            System.out.println("You are an adult!");
        else if (age>= 60)
            System.out.println("You are in the best age!");
        else 

    }
}
