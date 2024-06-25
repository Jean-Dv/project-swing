package co.edu.uptc.controller;

import co.edu.uptc.model.Student;

public class StudentController {
    private static StudentController _instance;
    Student student;

    private StudentController() {
        student = new Student();
    }

    public static StudentController getInstance() {
        if (_instance == null) {
            _instance = new StudentController();
        }
        return _instance;
    }

    public void saveStudent(String firstName, String lastName, String email, String id) {
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setEmail(email);
        student.setId(id);
    }

    public void editStudent(String firstName, String lastName, String email, String id) {
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setEmail(email);
        student.setId(id);
    }

    public void deleteStudent() {
        student = null;
    }

    public Student getStudent() {
        return student;
    }
}
