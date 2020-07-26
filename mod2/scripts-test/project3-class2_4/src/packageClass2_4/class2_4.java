//Script to learn how to work with variables in Java
//Created in 2020-07-25 by Aline Guerreiro

package packageClass2_4;

public class class2_4 {
    public static void main(String[] args) {
        int grade = 20;
        char typeStudant = 'B'; //char needs to have only one quotation mark
        double hoursDone = 2.5;
        boolean approved = true;

        System.out.println("Grade: "+ grade);
        System.out.println("Type of Studant: "+ typeStudant);
        System.out.println("Hours done: "+ hoursDone);
        System.out.println("Approved: "+ approved);

        grade = 30;
        typeStudant = '6';
        hoursDone = 4.0;
        approved = false;

        System.out.println("Grade: "+ grade);
        System.out.println("Type of Studant: "+ typeStudant);
        System.out.println("Hours done: "+ hoursDone);
        System.out.println("Approved: "+ approved);

    }
}