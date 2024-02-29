/* Declare a class called student having following data members:id_no, no_of_subjects_registered, subject_code, 
subject_credits, grade_obtained and spi. Deƒne constructor and calculate_spi methods.Deƒine main to instantiate an array 
for objects of class student to process data of n students to be given as command line arguments.*/

import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    char[] grade_obtained;
    double spi;

    Student() {
        this.id_no = 000;
        this.no_of_subjects_registered = 5;
    }

    public double calculate_spi() {
        int total_credits = 0;
        int sum = 0;
        for (int i = 0; i < this.no_of_subjects_registered; i++) {

            total_credits += this.subject_credits[i];
            sum += this.subject_credits[i] * (this.grade_obtained[i] - 'A' + 10);

        }
        spi = sum / total_credits;
        return spi;
    }
}

public class J0601Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Student std = new Student();
        Student[] std = new Student[Integer.parseInt(args[0])];

        for (int i = 0; i < std.length; i++) {
            std[i] = new Student();

            System.out.println("Enter id_no of " + i + "th student :  ");
            std[i].id_no = sc.nextInt();

            System.out.println("Enter no of subjects:  ");
            std[i].no_of_subjects_registered = sc.nextInt();

            std[i].subject_code = new String[std[i].no_of_subjects_registered];
            std[i].subject_credits = new int[std[i].no_of_subjects_registered];
            std[i].grade_obtained = new char[std[i].no_of_subjects_registered];

            for (int j = 0; j < std[i].no_of_subjects_registered; j++) {
                System.out.printf("Enter subject code at %d:  ", j);
                std[i].subject_code[j] = sc.next();

                System.out.printf("Enter subject credits %d:  ", j);
                std[i].subject_credits[j] = sc.nextInt();

                System.out.printf("Enter obtained grade at %d:  ", j);
                std[i].grade_obtained[j] = (sc.next()).charAt(0);
            }
        }

        for (int i = 0; i < std.length; i++) {
            System.out.println("SPI = " + std[i].calculate_spi());

        }
        sc.close();

    }
}
