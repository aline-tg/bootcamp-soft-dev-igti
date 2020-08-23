//Script of second part of module 3 in Java - polimorphism
//Created in 2020-08-23 by Aline Guerreiro

import java.util.ArrayList;

public class BinarySearch {
    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>();
        
        System.out.println(list);

        for(int i = 0; i<= 100; i++){
            list.add(i);
        }
        System.out.println(list);
        
        int searchedElement = 61;
        int start = 0;
        int end = list.size() - 1;
        Boolean foundElement = false;

        // 1 2 3 4 5
        while (start <= end) {
            int middle = ( start+ end ) /2;
            
            if(list.get(middle)< searchedElement){
                start = middle + 1;
            } else if (list.get(middle) > searchedElement){
                end = middle -1;
            } else {
                System.out.println("Elemento encontrado no índice: " + middle);
                foundElement = true;
                break;
            }
        }
    }
}