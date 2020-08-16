//Script of stack practical example from module 3 in Java
//Created in 2020-08-10 by Aline Guerreiro

import java.util.Scanner;
import java.util.Stack;

public class SequenceClass {
    private Scanner scanner = new Scanner(System.in);

    public String showMenu(){
        System.out.println("Enter the sequence to check or enter exit to go out.");
        return scanner.nextLine();
    }

    public void start(){
        String sequence = showMenu();

        while(!sequence.equals("exit")){
            Stack<String> stack = new Stack<String>();
            boolean isSequenceOk = true;
            
            for (int i = 0; i < sequence.length(); i++){
                if(!isSequenceOk){
                    break;
                }

                char c = sequence.charAt(i);

                switch(c){
                    case ')':
                        if(stack.isEmpty()){
                            System.out.println("Invalid sequence.");
                            sequence = showMenu();
                            isSequenceOk = false;
                        } else {
                            String element = stack.pop(); //remove from stack
                            if(!element.equals("(")){
                                System.out.println("Invalid sequence.");
                                sequence = showMenu();
                                isSequenceOk = false;
                            }
                        }
                        break;
                    case ']':
                        if(stack.isEmpty()){
                            System.out.println("Invalid sequence.");
                            sequence = showMenu();
                            isSequenceOk = false;
                        } else {
                            String element = stack.pop(); //remove from stack
                            if(!element.equals("[")){
                                System.out.println("Invalid sequence.");
                                sequence = showMenu();
                                isSequenceOk = false;
                            }
                        }
                        break;
                    default:
                        stack.push(String.valueOf(c));
                }
            }
            if (stack.isEmpty()){
                System.out.println("Sequence is alright.");
            } else {
                System.out.println("Invalid sequence.");
            }
            sequence = showMenu();
        }
    }
}