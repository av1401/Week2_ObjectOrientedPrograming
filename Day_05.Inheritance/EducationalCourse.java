// Base class: Course
class Course {
    String courseName;
    int duration;  // duration in hours

    // Constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course information
    void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Subclass: OnlineCourse
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;  // Whether the course is recorded or live

    // Constructor
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Method to display online course information
    @Override
    void displayCourseInfo() {
        super.displayCourseInfo();  // Call base class method
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;      // Course fee
    double discount; // Discount on the course fee

    // Constructor
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Method to display paid online course information
    @Override
    void displayCourseInfo() {
        super.displayCourseInfo();  // Call base class method
        System.out.println("Fee: INR " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: INR " + (fee - (fee * discount / 100)));
    }
}

public class EducationalCourse {
    public static void main(String[] args) {
        // Create an object of PaidOnlineCourse
        PaidOnlineCourse course1 = new PaidOnlineCourse("Java Full Stack", 400, "Bridgelabz", true, 100.0, 20.0);

        // Display the course details
        course1.displayCourseInfo();
    }
}
