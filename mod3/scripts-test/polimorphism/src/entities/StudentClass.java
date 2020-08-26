//Script of second part of module 3 in Java - polimorphism
//Created in 2020-08-16 by Aline Guerreiro

package entities;

import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class StudentClass extends PersonClass {
    private String name;
    private Integer studentId;
    private ArrayList<GradeClass> grades;

    public StudentClass(){
        this.grades = new ArrayList<>();
    }

    public StudentClass(String name, Integer studentId){
        this.name = name;
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }

    public String toString() {
        return name + " - " + studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public ArrayList<GradeClass> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<GradeClass> grades) {
        this.grades = grades;
    }

}