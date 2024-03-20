package org.example;

import java.util.Scanner;

public class ConsoleIO implements UserIO {
    private Scanner scanner = new Scanner(System.in);

    public void print(String message) {
        System.out.println(message);
    }

    public String readString(String prompt) {
        print(prompt);
        return scanner.nextLine();
    }

    public int readInt(String prompt) {
        print(prompt);
        return scanner.nextInt();
    }

    public int readInt(String prompt, int min, int max) {
        int result;
        do {
            print(prompt);
            result = scanner.nextInt();
        } while (result < min || result > max);
        return result;
    }

    public double readDouble(String prompt) {
        print(prompt);
        return scanner.nextDouble();
    }

    public double readDouble(String prompt, double min, double max) {
        double result;
        do {
            print(prompt);
            result = scanner.nextDouble();
        } while (result < min || result > max);
        return result;
    }

    public float readFloat(String prompt) {
        print(prompt);
        return scanner.nextFloat();
    }

    public float readFloat(String prompt, float min, float max) {
        float result;
        do {
            print(prompt);
            result = scanner.nextFloat();
        } while (result < min || result > max);
        return result;
    }

    public long readLong(String prompt) {
        print(prompt);
        return scanner.nextLong();
    }

    public long readLong(String prompt, long min, long max) {
        long result;
        do {
            print(prompt);
            result = scanner.nextLong();
        } while (result < min || result > max);
        return result;
    }
}