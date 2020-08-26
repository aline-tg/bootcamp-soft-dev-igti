//Script of line practical example from module 3 in Java
//Created in 2020-08-11 by Aline Guerreiro

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class LineAttendanceClass {
    private final Scanner scanner = new Scanner(System.in);
    private final Queue<String> line = new LinkedList<>();

    private String showMenu() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Enter one of the commands below: \n");
        sb.append("1 - Show line \n");
        sb.append("2 - Add person in line \n");
        sb.append("3 - Call next person to be attended \n");
        sb.append("4 - Clean line \n");
        sb.append("5 - Exit \n");
        System.out.println(sb.toString());

        return scanner.nextLine();
    }

    public void start(){
        String option = showMenu();

        while(!option.equals("5")) {
            switch (option){
                case "1":
                    System.out.println(line);
                    option = showMenu();
                    break;
                case "2":
                    System.out.println("Enter pacient name:");
                    String item = scanner.nextLine();
                    line.add(item);
                    System.out.println(line);
                    option = showMenu();
                    break;
                case "3":
                    System.out.println("Next pacient to be attended: " + line.remove());
                    System.out.println(line);
                    option = showMenu();
                    break;
                case "4":
                    line.clear();
                    System.out.println(line);
                    option = showMenu();
                    break;
                default:
                    System.out.println("Invalid option.");
                    option = showMenu();
            }
        }     
    }
}