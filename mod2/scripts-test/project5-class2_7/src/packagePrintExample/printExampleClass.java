//Script to learn how to print results in Java
//Created in 2020-07-25 by Aline Guerreiro

package packagePrintExample;

public class printExampleClass {
    public static void main(String[] args) {
        int age = 30;
        double height = 1.81;
        String name = "Elena R.";
        boolean studant= true;
        char gender = 'M';

        System.out.printf("Age is %d years old and height is %.2f and the name is %s and the gender is %c. Is studant? %b", age, height, name, gender,studant);

    }
}