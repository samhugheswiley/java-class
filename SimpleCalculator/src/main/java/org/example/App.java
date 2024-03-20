package org.example;

import java.util.Scanner;
import java.util.List;

public class App {
    public static void printOperations(){
        System.out.println("Select an Operation:");
        System.out.println("Addition (a)");
        System.out.println("Subtraction (s)");
        System.out.println("Multiplication (m)");
        System.out.println("Division (d)");
        System.out.println("Quit (q)");
    }

    public static void main(String[] args) {

        Boolean quit = false;
        String operation;

        List<String> operationList = List.of("a", "s", "m", "d", "q");

        Scanner inputReader = new Scanner(System.in);



        do{
            printOperations();
            operation = inputReader.nextLine();

            while(!(operationList.contains(operation))){
                System.out.println("Please choose from one of the given characters");
                printOperations();
                operation = inputReader.nextLine();
            }

            if (operation.equals("q")){
                quit = true;
            }
            else{

                // Do everything here

                System.out.println("PROGRAM RUNNING");


            }




        }while (!quit);


    }
}