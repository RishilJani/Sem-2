/*
Declare a class called book having author_name as private data member. Extend book class to have two sub classes called 
book_publication & paper_publication. Each of these classes have private member called title. Write a complete program to 
show usage of dynamic method dispatch (dynamic polymorphism) to display book or paper publications of given author.Use 
command line arguments for inputting data
 */

import java.util.Scanner;

class Book {
    private String author_name;

    void setter(String str) {
        this.author_name = str;
    }

    String getter() {
        return author_name;
    }

    public void display() {
        System.out.println("Author = " + author_name);
    }
}

class Book_Publication extends Book {
    private String title;

    void setter(String str) {
        this.title = str;
    }

    void setter(String str1, String str2) {
        super.setter(str1);
        this.title = str2;
    }

    String getter() {
        return title;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Title of the book = " + title);
    }
}

class Paper_Publication extends Book {
    private String title;

    void setter(String str) {
        this.title = str;
    }

    String getter() {
        return title;
    }

    void setter(String str1, String str2) {
        super.setter(str1);
        this.title = str2;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Paper's Title = " + title);
    }
}

public class J0602Book {
    public static void main(String[] args) {
        Book b = new Book();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Author's name: ");
        b.setter(sc.nextLine());

        // Book b1 = null;
        System.out.println("Enter publication: ");

        if ("book".equals(sc.nextLine())) {

            Book_Publication b1 = new Book_Publication();
            System.out.println("Enter Book's title: ");
            b1.setter(b.getter(), sc.nextLine());
            b1.display();

        } else if ("paper".equals(sc.nextLine())) {
            Paper_Publication b1 = new Paper_Publication();

            System.out.println("Enter Paper's title: ");
            b1.setter(b.getter(), sc.nextLine());

            b1.display();
        }

        sc.close();
    }
}