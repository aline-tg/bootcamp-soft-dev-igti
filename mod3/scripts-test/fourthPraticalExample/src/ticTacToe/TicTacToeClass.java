//Script of matrix examples from module 3 in Java
//Created in 2020-08-10 by Aline Guerreiro

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeClass {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<ArrayList<String>> matrix = new ArrayList<ArrayList<String>>();
    
    private String askTry(){
        for(int i=0; i < matrix.size(); i++){
            System.out.println(matrix.get(i));
        }

        return scanner.nextLine();
    }

    public void start(){
        ArrayList<String> lineMatrix1 = new ArrayList<String>(Arrays.asList("_","_","_"));
        ArrayList<String> lineMatrix2 = new ArrayList<String>(Arrays.asList("_","_","_"));
        ArrayList<String> lineMatrix3 = new ArrayList<String>(Arrays.asList("_","_","_"));
        
        matrix.add(lineMatrix1);
        matrix.add(lineMatrix2);
        matrix.add(lineMatrix3);

        Boolean tryPlayer1 = true;
        Boolean thereIsWinner = false;
        for (int i=0; i<9; i++){
            String try1 = askTry();

            Integer line = Integer.valueOf(try1.split("-")[0]);
            Integer col = Integer.valueOf(try1.split("-")[1]);
            
            if (tryPlayer1){
                matrix.get(line).set(col, "X");
            } else {
                matrix.get(line).set(col, "O");
            }

            if (checkWinner()){
                String winner = tryPlayer1 ? "Player 1" : "Player 2";
                System.out.println("The winner is: " + winner);
                thereIsWinner = true;
                break;
            } 
            tryPlayer1 = !tryPlayer1;
        }
        if (!thereIsWinner){
            System.out.println("We don't have winners :(");
        }
    }

    private Boolean checkWinner() {
        for(int i=0; i<3; i++){
            //lines
            String h1 = matrix.get(i).get(0);
            String h2 = matrix.get(i).get(1);
            String h3 = matrix.get(i).get(2);

            if(!h1.equals("_") && h1.equals(h2) && h1.equals(h3)){
                return true;
            }

            //cols
            String v1 = matrix.get(0).get(i);
            String v2 = matrix.get(1).get(i);
            String v3 = matrix.get(2).get(i);
    
            if(!v1.equals("_") && v1.equals(v2) && v1.equals(v3)){
                    return true;
            }
        }
        //diags
        String d1 = matrix.get(0).get(0);
        String d2 = matrix.get(1).get(1);
        String d3 = matrix.get(2).get(2);

        if(!d1.equals("_") && d1.equals(d2) && d1.equals(d3)){
            return true;
        }  
        
        String di1 = matrix.get(0).get(2);
        String di2 = matrix.get(1).get(1);
        String di3 = matrix.get(2).get(0);

        if(!di1.equals("_") && di1.equals(di2) && di1.equals(di3)){
            return true;
        }
        return false;
    }
}