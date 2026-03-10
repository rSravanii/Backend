import java.util.Scanner;

public class Management {
    // main class to test the above methods
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        // Adding books to the library
        System.out.println("Enter book name to add to library:");
        String bookName = sc.nextLine();
        System.out.println("Enter book edition:");
        int edition = sc.nextInt();
        sc.nextLine(); // Consume newline
        Book book1 = new Book(bookName, edition);
        library.addBook(book1);

        // Searching for a book
        System.out.println("Enter book name to search in library:");
        String searchName = sc.nextLine();
        library.searchBook(searchName);

        // Issuing a book
        System.out.println("Enter book name to issue:");
        String issueName = sc.nextLine();
        library.issueBook(issueName);

        // Returning a book
        System.out.println("Enter book name to return:");
        String returnName = sc.nextLine();
        library.returnBook(returnName);

        sc.close();

    }

}