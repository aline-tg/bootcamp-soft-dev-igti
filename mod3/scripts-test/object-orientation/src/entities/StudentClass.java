//Script of second part of module 3 in Java
//Created in 2020-08-16 by Aline Guerreiro

import java.lang.String;
import java.lang.Integer;

public class StudentClass extends PersonClass {
    private Integer studentId;   

    public StudentClass() {

    }

    public StudentClass(String name, String document, String phone, String address, Integer studentId){
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.studentId = studentId;
    }
    
    public StudentClass(String name){
        this.name = name;
    }

    public Integer getStudentId(){
        return studentId;
    }
    public void setStudentId(Integer studentId){
        this.studentId = studentId;
    }

    public String showType(){
        return "Student";
    }
}

