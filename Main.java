public interface Book {
    public void displayInfo();
}
public interface Author {
    public void displayInfo();
}
public class Main {
    public static void main(String[] args) {
        Book book = new Book() {
            String title = "IT";
            String binding = "Hardcover";
            String publisher = " Viking Press";
            int year = 1986;
            String genre = "Horror";
            @Override
            public void displayInfo() {
                System.out.println("Book Detail:");
                System.out.println("Title: " + title);
                System.out.println("Binding: " + binding);
                System.out.println("Publisher: " + publisher);
                System.out.println("Year of Publication: " + year);
                System.out.println("Genre: " + genre);
            }
        };
        Author author = new Author() {
            String fullName = "Stephen King";
            String phone = "555-555-5555";
            String email = "j@example.com";
            int rating = 10;
            @Override
            public void displayInfo() {
                System.out.println("\nAuthor Detail:");
                System.out.println("Full Name: " + fullName);
                System.out.println("Phone: " + phone);
                System.out.println("Email: " + email);
                System.out.println("Rating: " + rating);
            }
        };
        book.displayInfo();
        author.displayInfo();
    }
}