// book class

import java.util.Scanner;
import java.util.ArrayList;

class Book {

    private String BookName;
    private int Edition;
    private boolean isIssued;
    private boolean isReturned;

    public Book(String name, int year) {
        this.BookName = name;
        this.Edition = year;
        this.isIssued = false;
        this.isReturned = false;
    }

    public String getBookName() {
        return BookName;
    }

    public int getEdition() {
        return Edition;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            isReturned = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

}
