//Script to learn how to work with inputs from keyboard in Java
//Created in 2020-07-26 by Aline Guerreiro

package examplePackage;

import java.math.*;
import java.util.*;

public class exampleClass {
    public static void main(String[] args) {

      double grade1, grade2, grade3, grade4, frequency, totalGrade;
      char studentStatus;

      Scanner grades = new Scanner(System.in);
      Scanner charactersInput = new Scanner(System.in);

      //Get the student name like input
      System.out.print("Enter student name: ");
      String nameStudent = charactersInput.nextLine();
      
      //Get the student status like input
      System.out.print("Enter student status: O->Ok; P->Pending");
      studentStatus = charactersInput.nextLine().charAt(0);
      
      //Get the grades of student like input
      System.out.print("Enter the first grade:");
      grade1 = grades.nextDouble();
      System.out.print("Enter the second grade:");
      grade2 = grades.nextDouble();
      System.out.print("Enter the third grade:");
      grade3 = grades.nextDouble();
      System.out.print("Enter the fourth grade:");
      grade4 = grades.nextDouble();

      //Get frequency of student like input
      System.out.print("Enter the fourth grade:");
      frequency = grades.nextDouble();

      totalGrade = grade1 + grade2 + grade3 + grade4;

      boolean approved = totalGrade >= 70 && frequency >= 0.75;
      
      System.out.printf("The student has %s final grade %.2f and freqnecy %.2f. The student status is: %c. /n"
                        + "Is student passed? %b", nameStudent, totalGrade, frequency*100, studentStatus,approved);
    }
}