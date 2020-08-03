//Script about challenge module 2 from bootcamp
//Created in 2020-08-02 by Aline Guerreiro

package examplePackage;
import java.util.Scanner;

public class exampleClass {
    public static void main(String[] args) {
        String[] customerName = new String[50];
        double[] purchaseValue = new double[50];
        double meanOfPurchases = 0, upperPurchaseValue = 0, sumPurchase = 0;
        String nameCustomerUpperPurchase = "";
        int i = 0, numberPurchases = 0;
        Scanner inpCaractere = new Scanner(System.in);
        Scanner inpNumbers = new Scanner(System.in);
        System.out.println("How much purchases will be informed? ");
        numberPurchases = inpNumbers.nextInt();
        for(i=0; i < numberPurchases; i++){
            System.out.printf("Enter the name of customer that bought %d: \n", i+1);
            customerName[i]= inpCaractere.nextLine();

            System.out.printf("Enter the value bought by customer %s: \n", customerName[i]);
            purchaseValue[i] = inpNumbers.nextDouble();

            if(purchaseValue[i] > upperPurchaseValue){
                upperPurchaseValue = purchaseValue[i];
                nameCustomerUpperPurchase = customerName[i];
            }
            //sumPurchase += purchaseValue[i];
        }
        sumPurchase += purchaseValue[i];
        for(i=0; i < numberPurchases; i++){
        //for(i=numberPurchases-1; i >= 0; i--){
            System.out.printf("***\n Purchase ID: %d. \n Name Customer: %s. \n Purchase value: %.2f. \n*** \n",i+1, customerName[i],purchaseValue[i]);
        }
        System.out.printf("The bigger purchase from customer is %s, with value of %.2f. \n", nameCustomerUpperPurchase, upperPurchaseValue);

    }
}
