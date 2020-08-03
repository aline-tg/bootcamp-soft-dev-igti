//Script to learn how to work with file reading
//Created in 2020-08-02 by Aline Guerreiro
package examplePackage;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class exampleClass2 {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("/home/aline/Área de Trabalho/Pessoal/Bootcamp/bootcamp-soft-dev-igti/mod2/scripts-test/project18-class3_12/src/examplePackage/dataFile2.txt");
            BufferedReader readFile = new BufferedReader(file);

            String line;
            line = readFile.readLine();

            while(line != null){
                String[] customerData = new String[4];
                customerData = line.split(";");

                System.out.printf("Id: %s. \n" +
                "Customer Name: %s. \n" +
                "Adress: %s. \n"+
                "City: %s. \n"+
                "Civil State: %s \n", customerData[0], customerData[1], customerData[2], customerData[3], customerData[4]);
                line = readFile.readLine();

                System.out.printf("\n");

            }
            readFile.close();
            file.close();
        } catch (IOException e){
            System.out.printf("Error on files reading: "+ e.getMessage());
        }
    }
}
