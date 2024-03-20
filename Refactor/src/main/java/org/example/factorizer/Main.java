package org.example.factorizer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Asks user for their factor
        Scanner inputReader = new Scanner(System.in);
        int factor;
        System.out.print("What number would you like to factor? ");
        factor = Integer.parseInt(inputReader.nextLine());
        System.out.println("The factors of " + factor + " are:");

        // Create list of Factors
        List factors = new ArrayList();


        // Add all factors to factors list
        for (int i = 1; i <= factor; i++) {
            if (factor % i == 0){
                //primeFoundInLoop = true;
                factors.add(i);
            }
        }

        // Print factors list

        newFactorize.printFactors(factors);



        // Print total number of factors
        System.out.println("");
        System.out.println(factor + " has " + factors.size() + " factors.");

        // Find out if the factor is a perfect number

        int factorSum = 0;

        for (int i = 0; i < factors.size(); i++) {

            factorSum = factorSum + i;
        }

        if (factor == factorSum){
            System.out.println(factor + " is a perfect number. ");
        }
        else{
            System.out.println(factor + " is not a perfect number. ");
        }

        // Find out if the factor is a prime

        if (factors.size() == 2){
            System.out.println(factor + " is a prime number.");
        }
        else{
            System.out.println(factor + " is not a prime number.");
        }


    }
}
