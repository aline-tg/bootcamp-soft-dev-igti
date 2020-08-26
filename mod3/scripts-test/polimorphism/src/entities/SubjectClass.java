//Script of second part of module 3 in Java - polimorphism
//Created in 2020-08-16 by Aline Guerreiro

package entities;

public class SubjectClass {
    private String subject;
    private ProfessorClass professor;


    public String toString() {
        return subject + " - " + professor;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ProfessorClass getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorClass professor) {
        this.professor = professor;
    }
}