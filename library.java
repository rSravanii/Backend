// library class

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getBookName());
    }

    // Method to search for a book by name
    public void searchBook(String name) {
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(name)) {
                System.out.println("Book found: " + book.getBookName());
                return book;
            }
        }
        return null;
    }

    // Method to issue a book by name
    public void issueBook(String name) {
        Book book = searchBook(name);
        if (book != null) {
            book.issueBook();
            System.out.println("Book issued: " + book.getBookName());
        } else {
            System.out.println("Book not found in the library.");
        }

    }

    // Method to return a book by name
    public void returnBook(String name) {
        Book book = searchBook(name);
        if (book != null) {
            book.returnBook();
            System.out.println("Book returned: " + book.getBookName());
        } else {
            System.out.println("Book not found in the library.");
        }
    }
}
