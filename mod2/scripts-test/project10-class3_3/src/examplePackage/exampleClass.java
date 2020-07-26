//Script to learn how to work with if conditionals in Java
//Created in 2020-07-26 by Aline Guerreiro

package examplePackage;

import java.math.*;
import java.util.*;

public class exampleClass {
    public static void main(String[] args) {

      double n1, n2, n3, averageGrades, total, frequency;
      Scanner input = new Scanner(System.in);
      String situation;

      System.out.println("Enter the first grade: ");
      n1 = input.nextDouble();
      
      System.out.println("Enter the second grade: ");
      n2 = input.nextDouble();

      System.out.println("Enter the third grade: ");
      n3 = input.nextDouble();

      total = n1 + n2 + n3;
      averageGrades = total/3;

      System.out.println("Enter the frequency of student: ");
      frequency = input.nextDouble();

      if(total>= 70 && frequency >= 0.75)
        situation = "Approved";      
      else if (total >= 40 && total < 70 && frequency >= 0.75)
        situation = "Recovery";
      else 
        situation = "Reproved";

      System.out.printf("The student has final grade %.2f and average by grades %.2f. The frequency was %.2f. So, student is %s.", total, averageGrades,frequency *100, situation);
    }
}