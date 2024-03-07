package org.example;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void game(){
        // Game loop function

        // Integers to keep track of how many wins each player has
        int draws = 0;
        int userWins = 0;
        int computerWins = 0;
        String[] optionsList = {"Rock", "Paper", "Scissors"};

        // Ask how many rounds the user wants to play
        Scanner inputReader = new Scanner(System.in);
        System.out.print("How many rounds would you like to play? (1 - 10) ");
        int rounds = Integer.parseInt(inputReader.nextLine());
        System.out.println(" ");

        // Only enter the game if the user chose between 1 and 10 rounds
        if ((rounds <= 10) && (rounds >= 1)){

            // Play the game for the amount of rounds the user requested
            for (int round = 1; round <= rounds; round++) {
                // Get user's choice
                System.out.print("Pick either Rock (1), Paper (2) or Scissors (3) ");
                int userChoice = Integer.parseInt(inputReader.nextLine());

                // Randomly generate computer's choice
                Random rng = new Random();
                int computerChoice = rng.nextInt(3) + 1;

                // If players draw
                if (userChoice == computerChoice){
                    draws ++;
                    System.out.println("The round is a draw because both you and the computer chose " + optionsList[userChoice - 1]);
                }

                // If user wins
                else if(((userChoice == 2) && (computerChoice == 1) ||
                        (userChoice == 3) && (computerChoice == 2) ||
                        (userChoice == 1) && (computerChoice == 3))){
                    userWins ++;
                    System.out.println("You beat the computer because " + optionsList[userChoice - 1] + " beats " + optionsList[computerChoice - 1]);
                }

                // If computer wins
                else if(((userChoice == 1) && (computerChoice == 2) ||
                        (userChoice == 2) && (computerChoice == 3) ||
                        (userChoice == 3) && (computerChoice == 1))){
                    computerWins ++;
                    System.out.println("You lost to the computer because " + optionsList[computerChoice - 1] + " beats " + optionsList[userChoice - 1]);
                }
                System.out.println(" ");
            }
            // Print how many wins each player has
            System.out.println("Ties: " + draws + " User Wins: " + userWins + " Computer Wins: " + computerWins);
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        // String representing whether the user wants to play again
        String playAgain;

        // Using a do while loop allows the game to run through once before asking the user if they want to play again
        do{
            // Calling play game function
            game();

            // Asking the user if they want to play again
            System.out.print("Do you want to play again? Yes (y) or No (n) ");
            Scanner playAgainReader = new Scanner(System.in);
            playAgain = playAgainReader.nextLine();
            System.out.println(" ");

        } while (playAgain.equals("y"));
    }
}