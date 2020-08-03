//Script to learn how to work with file reading
//Created in 2020-08-02 by Aline Guerreiro
package examplePackage;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class exampleClass {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("/home/aline/Área de Trabalho/Pessoal/Bootcamp/bootcamp-soft-dev-igti/mod2/scripts-test/project18-class3_12/src/examplePackage/dataFile.txt");
            BufferedReader readFile = new BufferedReader(file);

            String line;
            line = readFile.readLine();

            while(line != null){
                System.out.printf("%s \n", line);
                line = readFile.readLine();
            }
            readFile.close();
            file.close();
        } catch (IOException e){
            System.out.printf("Error on files reading: "+ e.getMessage());
        }
    }
}
