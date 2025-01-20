public class Book { 

    // Static variable to hold the name of the library for all books
    static String libraryName = "TMKOC";
    
    // Instance variables for book details
    String title, author;
    
    // Final variable for ISBN, which can't be modified once assigned
    final String isbn;

    // Constructor to initialize title, author, and isbn for each book object
    Book(String title, String author, String isbn){
        this.title = title;      // Assigns the provided title to the instance variable
        this.author = author;    // Assigns the provided author to the instance variable
        this.isbn = isbn;        // Assigns the provided isbn to the final instance variable
    }

    // Method to display book details
    public void displayDetails(){
        System.out.println("Title of the Book" + " : " + title);
        System.out.println("Author" + " : " + author);
        System.out.println("ISBN" + " : " + isbn);
    }

    // Method to check if the given object is an instance of the Employee class
    public static void checkInstance(Object obj) {
        if (obj instanceof Book) {
            System.out.println(obj + " is an instance of Book.");
        }
        else {
            System.out.println(obj + " is not an instance of Book.");
        }
    }

    // Main method to create Book objects and display their details
    public static void main(String[] args) {
        // Create two Book objects with specified title, author, and ISBN
        Book b1 = new Book("Lords of the Rings", "John", "RX3456");
        Book b2 = new Book("Harry Potter", "J.k.", "RX34789");

        // Display details for the first book
        b1.displayDetails();

        // Display details for the second book
        b2.displayDetails();
    }
}
