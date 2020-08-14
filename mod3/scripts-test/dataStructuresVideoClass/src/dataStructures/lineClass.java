//Script of line examples from module 3 in Java
//Created in 2020-08-08 by Aline Guerreiro

import java.util.LinkedList;
import java.util.Queue;

public class lineClass {
    public static void main(String[] args){
        Queue<String> line = new LinkedList<>();

        //To add elements in line
        line.add("Pessoa 1");
        line.add("Pessoa 2");
        line.add("Pessoa 3");
        line.add("Pessoa 4");
        line.add("Pessoa 5");

        System.out.println(line);

        //To remove the first element of line
        System.out.println(line.remove());

        System.out.println(line);

        //Get the first element and not remove it
        System.out.println(line.peek());

        //To check if exists this element on line
        line.contains("Pessoa 3");
        
        //To check line size
        line.size();
        
        //To check if line is empty
        line.isEmpty();

        //To clean the line
        line.clear();
    }
}