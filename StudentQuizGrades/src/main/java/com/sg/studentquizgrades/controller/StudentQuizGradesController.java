package com.sg.studentquizgrades.controller;


import com.sg.studentquizgrades.ui.UserIO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentQuizGradesController {
    private final UserIO io;
    private final HashMap<String, ArrayList<Integer>> studentGrades;

    public StudentQuizGradesController(UserIO io) {
        this.io = io;
        this.studentGrades = new HashMap<>();
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection;
        while (keepGoing) {
            printMenu();
            menuSelection = io.readInt("Please select from the above choices.", 1, 9);

            switch (menuSelection) {
                case 1:
                    listStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    viewQuizScores();
                    break;
                case 5:
                    viewAverageScore();
                    break;
                case 6:
                    addStudentQuizScore();
                    break;
                case 7:
                    viewClassAverage();
                    break;
                case 8:
                    viewLowestStudentScore();
                    break;
                case 9:
                    viewHighestStudentScore();
                    break;
                default:
                    keepGoing = false;
                    break;
            }
            io.readString("Please hit enter to continue");
        }
        io.print("Goodbye!");
    }

    private void printMenu() {
        io.print("Main Menu");
        io.print("1. List Students");
        io.print("2. Add a Student");
        io.print("3. Remove a Student");
        io.print("4. View Quiz Scores for a Student");
        io.print("5. View Average Score for a Student");
        io.print("6. Add Student Quiz Score");
        io.print("7. View Class Average");
        io.print("8. View Lowest Student Score");
        io.print("9. View Highest Student Score");
        io.print("10. Exit");
    }


    private void listStudents() {
        String[] students = studentGrades.keySet().toArray(new String[0]);
        for (String student : students) {
            io.print(student);
        }
    }

    private void addStudent() {
        String name = io.readString("Enter the student's name:");
        studentGrades.put(name, new ArrayList<>());
    }

    private void removeStudent() {
        String name = io.readString("Enter the student's name:");
        studentGrades.remove(name);
    }

    private void viewQuizScores() {
        String name = io.readString("Enter the student's name:");
        ArrayList<Integer> scores = studentGrades.get(name);
        if (scores != null) {
            for (int score : scores) {
                io.print(Integer.toString(score));
            }
        }
    }

    private void viewAverageScore() {
        String name = io.readString("Enter the student's name:");
        ArrayList<Integer> scores = studentGrades.get(name);
        if (scores != null) {
            double sum = 0.0;
            for (int score : scores) {
                sum += score;
            }
            double average = sum / scores.size();
            io.print("The average score is: " + average);
        }
    }

    private void addStudentQuizScore() {
        String name = io.readString("Enter the student's name:");
        int score = io.readInt("Enter the quiz score:", 0, 100);
        ArrayList<Integer> scores = studentGrades.get(name);
        if (scores != null) {
            scores.add(score);
        } else {
            io.print("Student not found.");
        }
    }

    private void viewClassAverage() {
        double totalSum = 0.0;
        int totalScores = 0;
        for (ArrayList<Integer> scores : studentGrades.values()) {
            for (int score : scores) {
                totalSum += score;
                totalScores++;
            }
        }
        double average = totalSum / totalScores;
        io.print("The class average score is: " + average);
    }

    private void viewLowestStudentScore() {
        String lowestScoringStudent = null;
        int lowestScore = Integer.MAX_VALUE;
        for (Map.Entry<String, ArrayList<Integer>> entry : studentGrades.entrySet()) {
            for (int score : entry.getValue()) {
                if (score < lowestScore) {
                    lowestScore = score;
                    lowestScoringStudent = entry.getKey();
                }
            }
        }
        if (lowestScoringStudent != null) {
            io.print("The student with the lowest score is: " + lowestScoringStudent + " with a score of: " + lowestScore);
        } else {
            io.print("No students found.");
        }
    }

    private void viewHighestStudentScore() {
        String highestScoringStudent = null;
        int highestScore = Integer.MIN_VALUE;
        for (Map.Entry<String, ArrayList<Integer>> entry : studentGrades.entrySet()) {
            for (int score : entry.getValue()) {
                if (score > highestScore) {
                    highestScore = score;
                    highestScoringStudent = entry.getKey();
                }
            }
        }
        if (highestScoringStudent != null) {
            io.print("The student with the highest score is: " + highestScoringStudent + " with a score of: " + highestScore);
        } else {
            io.print("No students found.");
        }
    }
}
