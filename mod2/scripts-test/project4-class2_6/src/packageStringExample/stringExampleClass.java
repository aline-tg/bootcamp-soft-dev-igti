//Script to learn how to work with variables in Java
//Created in 2020-07-25 by Aline Guerreiro

package packageStringExample;

public class stringExampleClass {
    public static void main(String[] args) {
        String name, name2;
        name = "John Malcovich";
        name2 = "Hanna Montana";

        System.out.println(name);
        System.out.println(name2);

        int nameSize = name.length(), nameSize2= name2.length();

        System.out.println("The variable name has: " + nameSize + "characters");
        System.out.println("The variable name has: " + nameSize2 + "characters");

        int totalChar = nameSize + nameSize2;

        System.out.println("The total of characters are: " + totalChar);
        
        String concatenatedNames = name.concat(name2);

        System.out.println(concatenatedNames);

        String nameWithoutA= name.replace("a", "9");
        System.out.println(nameWithoutA);

        String onlyName = name2.substring(0,5);
        System.out.println(onlyName);

        String allUpperCase = name.toUpperCase();
        System.out.println(allUpperCase);

        String allLowerCase = name.toLowerCase();
        System.out.println(allLowerCase);

    }
}