// Base class: Employee
class Employee {
    String name;
    int id;
    double salary;

    // Constructor for Employee
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    int teamSize;

    // Constructor for Manager
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);  // Call the parent class constructor
        this.teamSize = teamSize;
    }

    // Override displayDetails to include team size
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call the parent class method
        System.out.println("Team Size: " + teamSize);
    }
}

// Subclass: Developer
class Developer extends Employee {
    String programmingLanguage;

    // Constructor for Developer
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);  // Call the parent class constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Override displayDetails to include programming language
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call the parent class method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Subclass: Intern
class Intern extends Employee {
    int internshipDuration;

    // Constructor for Intern
    public Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);  // Call the parent class constructor
        this.internshipDuration = internshipDuration;
    }

    // Override displayDetails to include university
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call the parent class method
        System.out.println("Internship Duration: " + internshipDuration + " Months");
    }
}

// Main class to test the hierarchy
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create instances of different employee types
        Manager manager = new Manager("Abhishek", 101, 80000, 10);
        Developer developer = new Developer("Mansi", 102, 60000, "Java");
        Intern intern = new Intern("Swayam", 103, 50000, 3 );

        // Display details for each employee type
        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println();

        System.out.println("Developer Details:");
        developer.displayDetails();
        System.out.println();

        System.out.println("Intern Details:");
        intern.displayDetails();
    }
}