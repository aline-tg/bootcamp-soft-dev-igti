//Script of list examples from module 3 in Java
//Created in 2020-08-08 by Aline Guerreiro

import java.util.ArrayList;
import java.util.Scanner;

public class PurchaseList {
    private ArrayList<String> list = new ArrayList<String>();
    private Scanner scanner = new Scanner(System.in);
    

    private String showMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("Enter the wanted command: \n");
        sb.append("1 - Show the list \n");
        sb.append("2 - Add new items on list \n");
        sb.append("3 - Remove items from list \n");
        sb.append("4 - Clean list \n");
        sb.append("5 - To close program and exit \n");
        System.out.println(sb.toString());

        return scanner.nextLine();
    }

    public void start(){
        String option = showMenu();
        while (!option.equals("5")){
            switch (option){
                case "1":
                    System.out.println(list);
                    option = showMenu();
                    break;
                case "2":
                    System.out.println("Enter the item to add in list:");
                    String item = scanner.nextLine();
                    list.add(item);
                    System.out.println(list);
                    option = showMenu();
                    break;
                case "3":
                    System.out.println("Choose the item you want to be removed from list:");
                    String itemRemoved = scanner.nextLine();
                    if(list.contains(itemRemoved)){
                        int index = list.indexOf(itemRemoved);
                        list.remove(index);
                        System.out.println(list);
                        option = showMenu();
                        break;
                    } else {
                        System.out.println("Invalid entry. Try again");
                        option = showMenu();
                        break;
                    }
                case "4":
                    list.clear();
                    System.out.println(list);
                    option = showMenu();
                    break;
                default:
                    System.out.println("Invalid Option.");
                    option = showMenu();
            }
        }
        scanner.close();
        System.out.println("Thanks for use our program :) ");
    }

    
}