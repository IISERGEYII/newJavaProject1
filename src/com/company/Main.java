package com.company;

import model.Course;
import model.CourseEnrollment;
import model.Student;
import view.MainFrame;


public class Main {
    public static MainFrame mainFrame =new MainFrame();

    public static void main(String[] args) {
        Student student = new Student("Vladimir", "Ivanov");
        Course java = new Course("Java", "для начинающих");
        student.addCourse(java);

        System.out.println(CourseEnrollment.getAllEnrollments());
        System.out.println(student.getCourses());
    }
}
