//Script about challenge module 2 from bootcamp
//Created in 2020-08-03 by Aline Guerreiro

package examplePackage;

import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class exampleClass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[50];
        int numberCount = 0;
        char stay = 'Y';
        while (stay == 'Y' || stay == 'y'){
            System.out.printf("Enter %d number: \n", numberCount+1);
            numbers[numberCount] = input.nextInt();
            numberCount++;
            //numberCount+=1;
            input.nextLine();
            System.out.println("Do you want to enter numbers (Y - Yes, N -No)?");
            stay = input.nextLine().charAt(0);
        }
        try {
            FileWriter file = new FileWriter("/home/aline/Área de Trabalho/Pessoal/Bootcamp/bootcamp-soft-dev-igti/mod2/practical-example/second-project/src/examplePackage/dataFile.txt");
            PrintWriter storeFile = new PrintWriter(file);
            for(int i=0; i<numberCount; i++){
                if(numbers[i]%2 == 0 && numbers[i] > 10)
                    //storeFile.printf("%d%n", numbers[i]);
                    storeFile.printf("%d", i);
            }
            file.close();
            storeFile.close();
            System.out.println("Program finished.");
        }
        catch(IOException e){
            System.err.println("Error when recording data" + e.getMessage());
        }
    }
}
