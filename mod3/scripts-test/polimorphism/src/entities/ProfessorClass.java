//Script of second part of module 3 in Java - polimorphism
//Created in 2020-08-16 by Aline Guerreiro

package entities;

import java.util.Date;

public class ProfessorClass extends PersonClass {
    private Date admissionDate;

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String toString() {
        return getName();
    }
    
}