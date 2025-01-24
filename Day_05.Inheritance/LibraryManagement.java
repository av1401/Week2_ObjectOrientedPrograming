// Superclass: Book
class Book {
    // Attributes of the Book class
    String title;
    int publicationYear;

    // Constructor for the Book class
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author
class Author extends Book {
    // Additional attributes for the Author class
    String name;
    String bio;

    // Constructor for the Author class
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call the superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Overridden displayInfo method to include author details
    @Override
    void displayInfo() {
        super.displayInfo(); // Display book details using the superclass method
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class to test the system
public class LibraryManagement {
    public static void main(String[] args) {
        // Create an Author object
        Author author = new Author("Bhagvat Geeta", 5000, "Shree Krishna", "He is God.");

        // Display information about the book and its author
        author.displayInfo();
    }
}
