//Script to learn how to work with integration practices in Java
//Created in 2020-07-26 by Aline Guerreiro

package examplePackage;

public class exampleClass {
    public static void main(String[] args) {
      double grade1, grade2, grade3, grade4, frequency, totalGrade;
      char studentStatus;
      boolean approved;
      String nameStudent;

      nameStudent = "Ana Paula da Silva Couto";
      studentStatus = 'M';

      grade1 = 20;
      grade2 = 20;
      grade3 = 30;
      grade4 = 5;

      frequency = 0.8;

      totalGrade = grade1 + grade2 + grade3 + grade4;

      approved = totalGrade >= 70 && frequency >= 0.75;

      System.out.printf("The student %s has final grade %.2f and frequency %.2f%%. The status of student is: %c. \n Is student approved? %b", nameStudent,
                        totalGrade,frequency*100,studentStatus, approved);
    }
}