//Script of first practical example from module 3 in Java
//Created in 2020-08-15 by Aline Guerreiro

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import java.lang.Void;

public class PizzaManagementClass {
    private ArrayList<String> contactList = new ArrayList<String>();
    private Queue<String> orderLine= new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);
    private Stack<Integer> deliveries = new Stack<Integer>();

    private String showMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("Enter the wanted command: \n");
        sb.append("1 - Show your customer file: \n");
        sb.append("2 - Enter the next customer in list: \n");
        sb.append("3 - Choose the customer you want to be removed from list: \n");
        sb.append("4 - Add order \n");
        sb.append("5 - Remove order \n");
        sb.append("6 - Sorting deliveries, enter the distances separeted with , ... \n");
        sb.append("7 - Removing deliveries... \n");
        sb.append("8 - Exit \n");
        System.out.println(sb.toString());

        return scanner.nextLine();
    }

    public void start(){
        String option = showMenu();
        while (!option.equals("8")){
            switch (option){
                case "1":
                    System.out.println(contactList);
                    option = showMenu();
                    break;
                case "2":
                    System.out.println("Enter the next customer in list:");
                    String item = scanner.nextLine();
                    contactList.add(item);
                    System.out.println(contactList);
                    option = showMenu();
                    break;
                case "3":
                    System.out.println("Choose the customer you want to be removed from list:");
                    String itemRemoved = scanner.nextLine();
                    if(contactList.contains(itemRemoved)){
                        int index = contactList.indexOf(itemRemoved);
                        contactList.remove(index);
                        System.out.println(contactList);
                        option = showMenu();
                        break;
                    } else {
                        System.out.println("Invalid entry. Try again");
                        option = showMenu();
                        break;
                    }
                case "4":
                    System.out.println("Add order: ");
                    String order = scanner.nextLine();
                    orderLine.add(order);
                    System.out.println(orderLine);
                    option = showMenu();
                    break;
                case "5":
                    System.out.println("Remove order: ");
                    orderLine.remove();
                    System.out.println(orderLine);
                    option = showMenu();
                    break;
                case "6":
                    System.out.println("Sorting deliveries, enter the distances separeted with , ...");
                    String distance = scanner.nextLine();
                    Integer numberDeliveries = distance.split(",").length;
                    String[] deliveriesDistanceString = distance.split(",");
                    int[] deliveriesDistanceInt = new int[numberDeliveries];
                    if (distance.contains("-1")) {
                        option = showMenu();
                        break;
                    } else {
                        for(int i=0; i<numberDeliveries; i++) {
                            deliveriesDistanceInt[i] = Integer.parseInt(deliveriesDistanceString[i]);
                         }
                        Arrays.sort(deliveriesDistanceInt);
                        
                        for(int i=numberDeliveries-1; i>=0; i--) {
                            deliveries.push(deliveriesDistanceInt[i]);
                         } 
                        System.out.println(deliveries);
                        option = showMenu();
                        break;
                    }
                case "7":
                    System.out.println("Removing deliveries...");
                    deliveries.pop();
                    System.out.println(deliveries);
                    option = showMenu();
                    break;
                case "8":
                    System.out.println("Thanks for use our program :) ");
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