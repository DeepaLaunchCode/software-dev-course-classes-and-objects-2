package org.example;

// In a separate (adjacent) file, create a Student class with two public members:
// - A String member called name
// - A double member called grade

import java.util.ArrayList;
import java.util.List;

public class BetterStudentManager {
    public List<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {
        // This method should add a new student to the list of students
        if (name != null && !name.trim().isEmpty()) {
            Student newStudent = new Student(name, grade);
            students.add(newStudent);
        }
    }

    public void removeStudent(String name) {
        // This method should remove the student with the given name from the list of students
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.trim().equalsIgnoreCase(name)) {
                students.remove(i);
                i--; // adjust index due to shifting elements
            }
        }

    }

    public String getStudentList() {
        // This method should return a string with each student's name and grade3
        // separated by a space, with each student separated by a newline character ('\n')
        // E.g.
        // John 90.9
        // Jane 88.3
        //
        // You will need to use a String or StringBuilder to build the result by
        // looping through the list of students
        //
        // Replace the following line with your implementation
        StringBuilder viewstudent = new StringBuilder();
        viewstudent.append("Name  Grade \n");
        students.forEach(s -> viewstudent.append(s.name).append(" ").append(s.grade).append("\n"));
        return viewstudent.toString();
    }
}
