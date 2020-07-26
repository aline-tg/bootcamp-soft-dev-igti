//Script to learn how to work with operators in Java
//Created in 2020-07-25 by Aline Guerreiro

package packageOperatorsExample;

public class operatorsExampleClass {
    public static void main(String[] args) {
       //x^2 + 12x - 13 =0
       //2x^2 - 16x - 18 =0

       double a,b,c;
       a=1;
       b=12;
       c=-13;

       double delta=0;
       delta = (b*b) - (4*a*c);

       System.out.printf("The value of delta is: %.0f \n", delta);

       double xLine= 0;
       xLine = (-b + Math.sqrt(delta))/(2*a);
       System.out.printf("The value of x' is: %.0f \n", xLine); 

       double xDoubleLine = 0;
       xDoubleLine = (-b - Math.sqrt(delta))/(2*a);
       System.out.printf("The value of x'' is: %.0f \n", xDoubleLine);

    }
}