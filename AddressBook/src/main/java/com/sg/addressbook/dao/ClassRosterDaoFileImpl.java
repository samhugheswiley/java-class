package com.sg.addressbook.dao;


import com.sg.addressbook.dto.AddressBook;
import java.util.*;
import java.io.*;

public class AddressBookDaoFileImpl implements AddressBookDao {
    private Map<String, AddressBook> students = new HashMap<>();
    public static final String ROSTER_FILE = "roster.txt";
    public static final String DELIMITER = "::";

    @Override
    public AddressBook addStudent(String studentId, AddressBook student) throws ClassRosterDaoException {
        loadRoster();
        AddressBook newStudent = students.put(studentId, student);
        writeRoster();
        return newStudent;
    }

    // Implement other methods as necessary

    private void loadRoster() throws ClassRosterDaoException {
        Scanner scanner;

        try {
            scanner = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
        } catch (FileNotFoundException e) {
            throw new ClassRosterDaoException("-_- Could not load roster data into memory.", e);
        }

        String[] currentTokens;
        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            AddressBook currentStudent = new AddressBook(currentTokens[0]);
            currentStudent.setFirstName(currentTokens[1]);
            currentStudent.setLastName(currentTokens[2]);
            currentStudent.setCohort(currentTokens[3]);

            students.put(currentStudent.getStudentId(), currentStudent);
        }
        scanner.close();
    }

    private void writeRoster() throws ClassRosterDaoException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        } catch (IOException e) {
            throw new ClassRosterDaoException("Could not save student data.", e);
        }

        List<AddressBook> studentList = this.getAllStudents();
        for (AddressBook currentStudent : studentList) {
            out.println(currentStudent.getStudentId() + DELIMITER
                    + currentStudent.getFirstName() + DELIMITER
                    + currentStudent.getLastName() + DELIMITER
                    + currentStudent.getCohort());
            out.flush();
        }
        out.close();
    }
}