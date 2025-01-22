package com.ObjectModeling;

import java.util.*;

// Class representing a Course
class Course {
    String courseName; // Name of the course
    List<Student> enrolledStudents = new ArrayList<>(); // List of students enrolled in this course

    // Constructor to initialize the course name
    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this); // Ensure association in both directions
        }
    }

    // Method to display all students enrolled in this course
    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName + " - Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println(" - " + student.name);
        }
    }
}

// Class representing a Student
class Student {
    String name; // Name of the student
    List<Course> enrolledCourses = new ArrayList<>(); // List of courses the student is enrolled in

    // Constructor to initialize the student's name
    public Student(String name) {
        this.name = name;
    }

    // Method to enroll the student in a course
    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.enrollStudent(this); // Ensure association in both directions
        }
    }

    // Method to display all courses the student is enrolled in
    public void showEnrolledCourses() {
        System.out.println("Student: " + name + " - Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println(" - " + course.courseName);
        }
    }
}

// Class representing a School
class School {
    String schoolName; // Name of the school
    List<Student> students = new ArrayList<>(); // Aggregated list of students in the school

    // Constructor to initialize the school name
    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Method to display all students in the school
    public void showStudents() {
        System.out.println("School: " + schoolName + " - Students:");
        for (Student student : students) {
            System.out.println(" - " + student.name);
        }
    }
}

// Main class to demonstrate the relationships
public class SchoolManagement {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Indian Public School");

        // Create students
        Student Mansi = new Student("Mansi");
        Student Khyati = new Student("Khyati");

        // Add students to the school
        school.addStudent(Mansi);
        school.addStudent(Khyati);

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("History");

        // Enroll students in courses
        Mansi.enrollInCourse(math);
        Mansi.enrollInCourse(science);
        Khyati.enrollInCourse(math);
        Khyati.enrollInCourse(history);

        // Display school students
        school.showStudents();

        // Display courses each student is enrolled in
        Mansi.showEnrolledCourses();
        Khyati.showEnrolledCourses();

        // Display students enrolled in each course
        math.showEnrolledStudents();
        science.showEnrolledStudents();
        history.showEnrolledStudents();
    }
}
