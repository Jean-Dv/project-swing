package co.edu.uptc.controller;

import co.edu.uptc.model.Course;

public class CourseController {
    private static CourseController _instance;
    private Course course;

    private CourseController() {
        course = new Course();
    }

    public static CourseController getInstance() {
        if (_instance == null) {
            _instance = new CourseController(); // Singleton
        }
        return _instance;
    }

    public void saveCourse(String name, String code, int credits) {
        course.setName(name);
        course.setCode(code);
        course.setCredits(credits);
    }

    public void editCourse(String name, String code, int credits) {
        course.setName(name);
        course.setCode(code);
        course.setCredits(credits);
    }

    public void deleteCourse() {
        course = null;
    }

    public Course getCourse() {
        return course;
    }

}
