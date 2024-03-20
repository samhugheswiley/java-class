package org.example;

import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class Main {
    public static void m`ain(String[] args) {
        Main game = new Main();
        game.loadStateCapitals();
        game.printStates();
        game.playGame();
    }
    private HashMap<String, String> stateCapitals = new HashMap<>();
    private Random random = new Random();

    public void loadStateCapitals() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/main/java/org/example/StateCapitals.txt"));
            for (String line : lines) {
                String[] parts = line.split("=");
                stateCapitals.put(parts[0], parts[1]);
            }
            System.out.println(stateCapitals.size() + " STATES & CAPITALS ARE LOADED.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printStates() {
        System.out.println("HERE ARE THE STATES :");
        for (String state : stateCapitals.keySet()) {
            System.out.print(state + ", ");
        }
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        List<String> states = new ArrayList<>(stateCapitals.keySet());
        String state = states.get(random.nextInt(states.size()));
        System.out.println("\nREADY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF '" + state + "'?");
        String userAnswer = scanner.nextLine();
        if (stateCapitals.get(state).equalsIgnoreCase(userAnswer)) {
            System.out.println("NICE WORK! " + userAnswer + " IS CORRECT!");
        } else {
            System.out.println("SORRY, THE CORRECT ANSWER WAS " + stateCapitals.get(state));
        }
        scanner.close();
    }
}