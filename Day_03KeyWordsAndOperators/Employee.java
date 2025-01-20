public class Employee {
    // Static variable to hold the company name shared by all employees
    static String CompanyName = "ABC";

    // Instance variables for employee details
    String name;
    final int id; // Final variable for employee ID, it cannot be changed once assigned
    String designation;

    // Static variable to keep track of the total number of employees
    static int totalEmployees = 0;

    // Constructor to initialize employee details and increment the totalEmployee count
    Employee(String name, int id, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees(){
        // Display the total number of employees using the static variable totalEmployee
        System.out.println("Total number of Employees: " + totalEmployees);
    }

    // Instance method to display details of a specific employee
    void display(){
        System.out.println("Employee Name : "+name);
        System.out.println("Employee id : "+id);
        System.out.println("Employee designation : "+designation);
    }
    // Method to check if the given object is an instance of the Employee class
    public static void checkInstance(Object obj) {
        if (obj instanceof Employee) {
            System.out.println(obj + " is an instance of Employee.");
        }
        else {
            System.out.println(obj + " is NOT an instance of Employee.");
        }
    }

    // Main method to create Employee objects and display their details
    public static void main(String[] args){
        // Create two Employee objects with their name, ID, and designation
        Employee employee1 = new Employee("Abhishek",7,"Senior Developer");
        Employee employee2 = new Employee("Sahil",8, "Senior Developer");
        // Call the static method to display the total number of employees
        displayTotalEmployees();

        //display employee detail
        employee1.display();
        System.out.println("----------------------------------------");

        employee2.display();

        // Create a non-Employee object for testing
        String nonEmployee = new String("Jaspreet");
        System.out.println();
        // Check instances
        checkInstance(employee1); // Should indicate that it's an Employee
        checkInstance(nonEmployee); // Should indicate that it's NOT an Employee
    }
}
