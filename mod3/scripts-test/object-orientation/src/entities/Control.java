//Script of second part of module 3 in Java
//Created in 2020-08-16 by Aline Guerreiro

import java.util.ArrayList;

public class Control {
    private ArrayList<StudentClass> students = new ArrayList<>();
    private ArrayList<CLevelClass> clevels = new ArrayList<>();
    private ArrayList<ProfessorClass> professors = new ArrayList<>();
    private ArrayList<PersonClass> person = new ArrayList<PersonClass>();
    
    public void start(){
       StudentClass student1 = new StudentClass();
       student1.setName("João Silva");
       student1.setDocument("12345678999");
       student1.setPhone("(31)98988-9889");
       student1.setAddress("Rua X");
       student1.setStudentId(123456);
       student1.setNumberAddress("251");

       StudentClass student2 = new StudentClass("Maria Sousa", "01234567899","(31)98899-4545", "Rua Y",666587);
       
       StudentClass student3 = new StudentClass("José Rocha");
       student3.setDocument("3232233232");
       student3.setPhone("(31)98988-1544");

       students.add(student1);
       students.add(student2);
       students.add(student3);

       ProfessorClass professor1 = new ProfessorClass();
       professor1.setName("Henrique souza");

       CLevelClass director1 = new CLevelClass();
       director1.setName("Genivaldo Silva");

       person.add(student1);
       person.add(director1);
       person.add(professor1);

       System.out.println(student1.fullAddress());
       System.out.println(student1.showType());
       System.out.println(director1.showType());
       System.out.println(professor1.showType());
       
       ArrayList<LocomotionInterface> list = new ArrayList<>();
       CarsClass car = new CarsClass();
       TruckerClass trucker = new TruckerClass();
       list.add(car);
       list.add(trucker);
       
       System.out.println(list);
    }
}