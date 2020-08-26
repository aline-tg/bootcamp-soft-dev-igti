//Script of second part of module 3 in Java - polimorphism
//Created in 2020-08-23 by Aline Guerreiro

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(4);
        list.add(5);
        list.add(2);

        System.out.println(list);

        Integer searchedElement = 41;
        Boolean foundElement = false;
        for(int i = 0; i<list.size(); i++){
            if (list.get(i).equals(searchedElement)){
               System.out.println("The element searched in on i index: " + i);
               foundElement = true; 
               break;
            }
        }
        if(!foundElement){
            System.out.println("The element is not found");
        }
    }
}