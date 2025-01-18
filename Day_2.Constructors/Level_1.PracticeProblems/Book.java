class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        this.title = "Dark World";
        this.author = "Abhishek Vishwakarma";
        this.price = 425;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display method
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    // Main method
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Guards of the North", "Abhishek Vishwakarma", 500);

        book1.display();
        book2.display();
    }
}
