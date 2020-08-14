//Script of stack examples from module 3 in Java
//Created in 2020-08-08 by Aline Guerreiro

package dataStructures;

import java.util.ArrayList;

public class stackClass {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();

        //Add elements on stack
        stack.add("Livro 1");
        stack.add("Livro 2");
        stack.add("Livro 3");
        stack.add("Livro 4");
        stack.add("Livro 5");

        System.out.println(stack);

        //Remove elements on stack
        System.out.println(stack.pop());
        System.out.println(stack);

        //Return the last element from stack without remove
        System.out.println(stack.peek());
        System.out.println(stack);

        //Search element in stack
        System.out.println(stack.search("Livro 3"));

        //Check if stack is empty 
        System.out.println(stack.isEmpty());
    } 
}