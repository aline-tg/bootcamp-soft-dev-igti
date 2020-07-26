//Script to learn how to work with logic operators in Java
//Created in 2020-07-26 by Aline Guerreiro

package examplePackage;

import java.math.*;

public class exampleClass {
    public static void main(String[] args) {
      boolean last3LoanPayedInScheduled, hasIncomeComproved, starCustomer;
      boolean creditRestriction;

      last3LoanPayedInScheduled = true;
      hasIncomeComproved = false;
      starCustomer = false;
      creditRestriction = false;

      boolean giveLoan = (last3LoanPayedInScheduled && hasIncomeComproved || starCustomer) && !creditRestriction;
      System.out.println("Was loan gived?: " + giveLoan);    
    }
}