package learningjava;

import java.util.Scanner;

public class lab4prob2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Book[] b = new Book[5];
        // take input for objects
        for (int i = 0; i < b.length; i++) {
            b[i] = new Book();
            System.out.println("Enter book isbn no:");
            int isbn = inp.nextInt();
            System.out.println("Enter book title: ");
            String title = inp.nextLine();
            System.out.println("Enter book page number: ");
            int pgno = inp.nextInt();
            b[i] = new Book(isbn, title, pgno);
        }
        // display all object info
        displayAll(b);

        // compare any two objects by method calling
        System.out.println(b[0].compareTo(b[1]));
        // check to see if book is heavy
        if (isHeavier(b[2])) {
            System.out.println("The book" + b[2].getTitle() + "is heavy");
        } else {
            System.out.println("The book" + b[2].getTitle() + "is not heavy");
        }

        inp.close();
    }
    //checks if book is heavy
    public static boolean isHeavier(Book b) {
        //checks if book pgno > 500
        if (b.getNumberofPages() > 500) {
            return true;
        } else {
            return false;
        }
    }
    // dispaying all book info
    public static void displayAll(Book[] b) {
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i].toString());
        }
        System.out.println();
    }
}



class Book {
    private int isbn, noOfPages, count;
    private String bookTitle;
    //default constructor
    Book() {
        count = 0;
    }
    //parameterized constructor
    Book(int is, String title, int pgn) {
        isbn = is;
        bookTitle = title;
        noOfPages = pgn;
        updateCount();
    }
    //updating count
    public void updateCount(){
        count++;
    }
    //
    public String toString() {
        return "Book Name: " + bookTitle + "\nISBN: " + isbn + "\nNumber of Pages: " + noOfPages;
    }
    // compares books to check for book with greater page number
    public int compareTo(Book b) {
        if (noOfPages > b.getNumberofPages()) {
            return 1;
        }
        if (noOfPages == b.getNumberofPages()) {
            return 0;
        } else {
            return -1;
        }
    }
    //setters
    public void setIsbn(int is){
        isbn = is;
    }
    public void setTitle(String t){
        bookTitle = t;
    }
    public void setNumberofPages(int pgno){
        noOfPages = pgno;
    }
    // getters
    public int getIsbn(){
        return isbn;
    }
    public String getTitle() {
        return bookTitle;
    }

    public int getCount() {
        return count;
    }

    public int getNumberofPages() {
        return noOfPages;
    }
}
