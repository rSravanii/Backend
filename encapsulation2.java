// book class in Java

//Create a Java program for the Book class which comes like book title book author book content and book price etc

class bookDetails {
    private String bookTitle;
    private String bookAuthor;
    private String bookContent;
    private int bookPrice;

    public bookDetails(String title, String author, String topic, int cost) {
        this.bookTitle = title;
        this.bookAuthor = author;
        this.bookContent = topic;
        this.bookPrice = cost;
    }

    public void setBookTitle(String title) {
        this.bookTitle = title;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookAuthor(String author) {
        this.bookAuthor = author;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookContent(String topic) {
        this.bookContent = topic;
    }

    public String getBookContent() {
        return bookContent;
    }

    public void setBookPrice(int cost) {
        this.bookPrice = cost;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public static void main(String[] args) {
        bookDetails bk1 = new bookDetails("the art of begin alone", "Renuka Gavrani", "self help", 500);
        bookDetails bk2 = new bookDetails("the power of now", "Eckhart Tolle", "spiritual", 300);
        System.out.println("Book Title: " + bk1.getBookTitle());
        System.out.println("Book Author: " + bk1.getBookAuthor());
        System.out.println("Book Content: " + bk1.getBookContent());
        System.out.println("Book Price: " + bk1.getBookPrice());
        System.out.println(("================================"));
        System.out.println("Book Title: " + bk2.getBookTitle());
        System.out.println("Book Author: " + bk2.getBookAuthor());
        System.out.println("Book Content: " + bk2.getBookContent());
        System.out.println("Book Price: " + bk2.getBookPrice());
    }

}
// output:

/*
 * Book Title: the art of begin alone
 * Book Author: Renuka Gavrani
 * Book Content: self help
 * Book Price: 500
 * ================================
 * Book Title: the power of now
 * Book Author: Eckhart Tolle
 * Book Content: spiritual
 * Book Price: 300
 */