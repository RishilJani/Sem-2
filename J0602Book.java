/*Declare a class called book having author_name as private data member. Extend book class to have two sub classes called 
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

}

class Book_Publication extends Book {
    private String title;

    void setter(String str) {
        this.title = str;
    }

    String getter() {
        return title;
    }

    public void display(String str1, String str2) {
        System.out.println("Book's Title = " + str1);
        System.out.println("Book's Author = " + str2);
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

    public void display(String str1, String str2) {
        System.out.println("Paper's Title = " + str1);
        System.out.println("Paper's Author =  " + str2);
    }
}

public class J0602Book {
    public static void main(String[] args) {
        Book b = new Book();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Author's name: ");
        b.setter(sc.nextLine());
        String str1 = b.getter();

        System.out.println("Enter publication: ");
        
        if ("book".equals(sc.nextLine())){
            Book_Publication b1 = new Book_Publication();

            System.out.println("Enter Book's title: ");
            b1.setter(sc.nextLine());
            
            String str = b1.getter();
            b1.display(str, str1);
        } 
        else if("paper".equals(sc.nextLine())){
            Paper_Publication p1 = new Paper_Publication();
        
            System.out.println("Enter Paper's title: ");
            p1.setter(sc.nextLine());

            String str = p1.getter();
            p1.display(str, str1);
        }

        sc.close();
    }
}
/*
 * Book b = new Book();
 * b.setter(args[0]);
 * String str = b.getter();
 * 
 * if (args[1] == "book") {
 * Book_Publication b1 = new Book_Publication();
 * b1.setter(args[2]);
 * b1.display(str, b1.getter());
 * }
 * else {
 * Paper_Publication p1 = new Paper_Publication();
 * p1.setter(args[2]);
 * p1.display(str, p1.getter());
 * }
 */