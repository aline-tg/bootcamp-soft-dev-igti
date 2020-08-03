//Script to learn how to work with for loops
//Created in 2020-08-02 by Aline Guerreiro
package examplePackage;

public class exampleClass {
    public static void main(String[] args) {
    
        int i = 0, j= 0;
        System.out.println("Start: Don't repeat");

        for (i=0; i < 10; i++){
            System.out.printf("i value is: %d. \n", i);
            for(j=0; j < 3; j++){
                System.out.printf("j value is: %d. \n", j);
            }
        }
        System.out.println("End: Don't repeat");   
    }
}
