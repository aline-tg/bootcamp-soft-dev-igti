//Script of matrix examples from module 3 in Java
//Created in 2020-08-13 by Aline Guerreiro

import java.util.Arrays;
import java.lang.Double;
import java.util.ArrayList;

public class MatrixClass {
    public static void main(String[] args){
        ArrayList<ArrayList<Double>> matrix = new ArrayList<ArrayList<Double>>();
    
        ArrayList<Double> line1 = new ArrayList<>();
        line1.add(8.0);
        line1.add(10.0);
        line1.add(7.0);
        line1.add(6.5);
        matrix.add(line1);

        System.out.println(matrix);

        ArrayList<Double> line2 = new ArrayList<Double>(Arrays.asList(7.0,9.0,5.0,4.0));
        matrix.add(line2);
        System.out.println(line2);
        
        ArrayList<Double> line3 = new ArrayList<Double>(Arrays.asList(4.0,8.0,6.0,9.0));
        matrix.add(line3);
        System.out.println(line3);

        for (int i =0; i < matrix.size(); i++){
            ArrayList<Double> line = matrix.get(i);
            System.out.println(line);

            for(int k=0; k < line.size(); k++){
                System.out.println(line.get(k));
            }
        }
    }
    
}