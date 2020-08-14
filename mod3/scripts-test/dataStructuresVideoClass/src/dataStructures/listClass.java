//Script of list examples from module 3 in Java
//Created in 2020-08-08 by Aline Guerreiro

package dataStructures;

import java.util.ArrayList;

public class listClass {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>(); 
        
        //add methods in array
        cars.add("Uno");
        cars.add("Gol");
        cars.add("Palio");
        
        //add element in position 1
        cars.add(1, "Sandero");

        //check if we have specified element in array
        if(cars.contains("Gol")){
            System.out.println("There is Gol element in Array");
        } else {
            System.out.println("There isn't Gol element in Array");
        }
        
        //index of first time the element appears in list
        int golFirstPosition = cars.indexOf("Gol"); 
        System.out.println(golFirstPosition);

        //index of last time the element appears in list
        int golLastPosition = cars.indexOf("Gol"); 
        System.out.println(golLastPosition);

        //index of first time the element appears in list
        int corollaFirstPosition = cars.indexOf("Corolla"); 
        System.out.println(corollaFirstPosition);

        //index of last time the element appears in list
        int corollaLastPosition = cars.indexOf("Corolla"); 
        System.out.println(corollaLastPosition);

        for (int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }

        //Change the element by a new one
        cars.set(0, "New Uno");

        //remove itens in array
        cars.remove(0);
        cars.remove(1);

        System.out.println("Deleting...");
        for (int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }

        //clean list of all elements
        cars.clear();

        System.out.println(cars);
    }
}