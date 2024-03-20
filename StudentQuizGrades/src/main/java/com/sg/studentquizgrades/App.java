package com.sg.studentquizgrades;

import com.sg.studentquizgrades.controller.StudentQuizGradesController;

import com.sg.studentquizgrades.ui.UserIO;
import com.sg.studentquizgrades.ui.UserIOConsoleImpl;

public class App {
    public static void main(String[] args) {
        UserIO io = new UserIOConsoleImpl();
        StudentQuizGradesController studentQuizGrades = new StudentQuizGradesController(io);
        studentQuizGrades.run();
    }
}
