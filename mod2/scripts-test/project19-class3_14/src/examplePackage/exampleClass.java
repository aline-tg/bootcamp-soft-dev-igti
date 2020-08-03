//Script to learn how to work with file saving
//Created in 2020-08-02 by Aline Guerreiro
package examplePackage;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class exampleClass {
    public static void main(String[] args) {
        try{
            FileWriter file = new FileWriter("/home/aline/Área de Trabalho/Pessoal/Bootcamp/bootcamp-soft-dev-igti/mod2/scripts-test/project19-class3_14/src/examplePackage/dataFile.txt");
            PrintWriter storeFile = new PrintWriter(file);
            
            for (int i=0; i<1000; i++){
                storeFile.printf("Value of i: %d.", i);
            }
            storeFile.close();
            file.close();
        } catch (IOException e){
            System.out.printf("Error on files storing: "+ e.getMessage());
        }
        System.out.println("End of execution");
    }
}
