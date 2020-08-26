//Script of second part of module 3 in Java - polimorphism
//Created in 2020-08-16 by Aline Guerreiro

package entities;

public class GradeClass {
    private SubjectClass subject;
    private Double grades;

    public String toString(){
        return subject.getSubject() + " - " + grades;
    }

    public SubjectClass getSubject() {
        return subject;
    }

    public void setSubject(SubjectClass subject) {
        this.subject = subject;
    }

    public Double getGrades() {
        return grades;
    }

    public void setGrades(Double grades) {
        this.grades = grades;
    }

} 