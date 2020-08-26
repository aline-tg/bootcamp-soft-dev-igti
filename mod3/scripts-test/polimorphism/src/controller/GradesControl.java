//Script of second part of module 3 in Java - polimorphism
//Created in 2020-08-16 by Aline Guerreiro

package controller;

import java.util.ArrayList;
import java.util.Scanner;
import entities.*;
import interfaces.BasicMethods;

public class GradesControl implements BasicMethods{
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<ProfessorClass> professors = new ArrayList<>();
    private ArrayList<SubjectClass> subjects = new ArrayList<>();
    private ArrayList<StudentClass> students = new ArrayList<>();

    private String showMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("Enter the wanted command: \n");
        sb.append("1 - Show students \n");
        sb.append("2 - Show classes \n");
        sb.append("3 - Add student \n");
        sb.append("4 - Add grade \n");
        sb.append("5 - Exclude grade \n");
        sb.append("6 - Consult grade(s) \n");
        sb.append("0 - Exit \n");

        System.out.println(sb.toString());
        return scanner.nextLine();
    }

    public void start(){
        startProfessorAndSubjext();
        String option = showMenu();
        while(!option.equals("0")){
            switch(option){
                case "1":
                    System.out.println(students);
                    option = showMenu();
                    break;
                case "2":
                    System.out.println(subjects);
                    option = showMenu();
                    break;
                case "3":
                    System.out.println("Enter the student name: ");
                    String name = scanner.nextLine();
                    
                    System.out.println("Enter the studentId: ");
                    Integer studentId = Integer.parseInt(scanner.nextLine());
                    
                    StudentClass student = new StudentClass(name, studentId);
                    
                    students.add(student);
                    System.out.println(students);
                    
                    option = showMenu();
                    break;
                case "4":
                    insert();                    
                    option = showMenu();
                    break;
                case "5":
                    exclude();
                    option = showMenu();
                    break;
                case "6":
                    consult();
                    option = showMenu();
                    break;
            }

        }
    }

    public void insert(){
        System.out.println("Enter the student index: ");
        Integer studentIndex = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Enter the class index: ");
        Integer classIndex = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Enter the grade: ");
        Double gradeValue = Double.parseDouble(scanner.nextLine());
        
        GradeClass grade = new GradeClass();
        grade.setGrades(gradeValue);
        grade.setSubject(subjects.get(classIndex));

        students.get(studentIndex).getGrades().add(grade);
    }


    public void exclude(){
        System.out.println("Enter the student index: ");
        Integer studentIndex = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Enter the grade index you want to exclude: ");
        int gradeId = Integer.parseInt(scanner.nextLine());
        
        students.get(studentIndex)
                .getGrades()
                .remove(gradeId);
    }


    public void consult(){
        System.out.println("Enter the student index: ");
        Integer studentIndex = Integer.parseInt(scanner.nextLine());
        System.out.println(students.get(studentIndex).getGrades());
    }

    private void startProfessorAndSubjext(){
        ProfessorClass professor1 = new ProfessorClass();
        professor1.setName("Beatriz Melo");
        SubjectClass subject1 = new SubjectClass();
        subject1.setSubject("Portuguese");
        subject1.setProfessor(professor1);
        
        ProfessorClass professor2 = new ProfessorClass();
        professor2.setName("Jorge Silva");
        SubjectClass subject2 = new SubjectClass();
        subject2.setSubject("Math");
        subject2.setProfessor(professor2);

        ProfessorClass professor3 = new ProfessorClass();
        professor3.setName("Marisa Santos");
        SubjectClass subject3 = new SubjectClass();
        subject3.setSubject("Geography");
        subject3.setProfessor(professor3);

        ProfessorClass professor4 = new ProfessorClass();
        professor4.setName("Everaldo Moisés");
        SubjectClass subject4 = new SubjectClass();
        subject4.setSubject("History");
        subject4.setProfessor(professor4);

        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);
        subjects.add(subject4);
    }
}