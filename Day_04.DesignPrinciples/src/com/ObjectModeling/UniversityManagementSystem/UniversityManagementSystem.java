package com.ObjectModeling.UniversityManagementSystem;
import java.util.*;

// Class representing a Student entity
class Student {
    String studentName; // Name of the student
    int studentId; // Unique identifier for the student
    List<Course> courseList = new ArrayList<>(); // List of courses the student is enrolled in

    // Constructor to initialize student details
    Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    // Method to display student details
    public void studentDetail() {
        System.out.println("Name: " + studentName);
        System.out.println("Student-Id: " + studentId);
        System.out.print("Enrolled courses: ");
        for (Course course : courseList) {
            System.out.print(course.courseName + ", ");
        }
        System.out.println('\n');
    }
}

// Class representing a Professor entity
class Professor {
    String professorName; // Name of the professor
    int professorId; // Unique identifier for the professor
    List<Course> courseList = new ArrayList<>(); // List of courses assigned to the professor

    // Constructor to initialize professor details
    Professor(String professorName, int professorId) {
        this.professorName = professorName;
        this.professorId = professorId;
    }

    // Method to display professor details
    public void professorDetail() {
        System.out.println("Professor Name: " + professorName);
        System.out.println("Professor Id: " + professorId);
        System.out.print("Assigned Courses: ");
        for (Course c : courseList) {
            System.out.print(c.courseName + ", ");
        }
        System.out.println('\n');
    }
}

// Class representing a Course entity
class Course {
    String courseName; // Name of the course
    List<Professor> professorList = new ArrayList<>(); // List of professors assigned to the course
    List<Student> studentList = new ArrayList<>(); // List of students enrolled in the course

    // Constructor to initialize course details
    Course(String courseName) {
        this.courseName = courseName;
    }

    // Method to assign a professor to the course
    public void assignProfessor(Professor professor) {
        professorList.add(professor);
    }

    // Method to enroll a student in the course
    public void enrollment(Student student) {
        studentList.add(student);
        student.courseList.add(this); // Add this course to the student's course list
    }

    // Method to display course details
    public void courseDetail() {
        System.out.println("Course name: " + courseName);
        System.out.print("Assigned Professors: ");
        for (Professor p : professorList) {
            System.out.print(p.professorName + " ");
        }
        System.out.println();
        System.out.print("Enrolled Students: ");
        for (Student s : studentList) {
            System.out.print(s.studentName + ", ");
        }
        System.out.println('\n');
    }
}

// Main class for managing the university system
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating professor instances
        Professor brahmma = new Professor("Brahmma", 1001);
        Professor vishnu = new Professor("Vishnu", 1002);
        Professor mahesh = new Professor("Mahesh", 1003);

        // Creating student instances
        Student abhishek = new Student("Abhishek", 7);
        Student swayam = new Student("Swayam", 11);

        // Creating course instances
        Course machineLearning = new Course("Machine Learning");
        Course dataStructure = new Course("Data Structure");
        Course oops = new Course("Object Oriented Programming");

        // Assigning professors to courses
        machineLearning.assignProfessor(brahmma);
        dataStructure.assignProfessor(vishnu);
        oops.assignProfessor(mahesh);

        // Enrolling students in courses
        machineLearning.enrollment(abhishek);
        machineLearning.enrollment(swayam);

        dataStructure.enrollment(abhishek);
        dataStructure.enrollment(swayam);

        oops.enrollment(abhishek);
        oops.enrollment(swayam);

        // Displaying student details
        System.out.println("Student Details: ");
        abhishek.studentDetail();
        swayam.studentDetail();

        // Displaying course details
        System.out.println('\n');
        System.out.println("Course Details:");
        dataStructure.courseDetail();
        machineLearning.courseDetail();
        oops.courseDetail();
    }
}