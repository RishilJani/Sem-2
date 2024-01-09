/* The marks obtained by a student in 5 different subjects are input through the keyboard. 
The student gets a division as per the following rules:
        I. Percentage above or equals to 60-ƒrst division
        II. Percentage between 50 to 59-second division
        III. Percentage between 40 and 49-Third division
        IV. Percentage less than 40-fail
*/

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int[] marks = new int[5];
        int i =-1;
        Scanner sc = new Scanner(System.in);

        marks[0] = 0;
        marks[1] = 0;
        marks[2] = 0;
        marks[3] = 0;
        marks[4] = 0;
        System.out.println("Enter total marks of a subject: ");
        int totalMarks = sc.nextInt();

        do{
            i++;
            System.out.printf("Enter %d marks: ",i);
            marks[i] = sc.nextInt();
            
        }while((marks[i]<=totalMarks && marks[i] >= 0) && i<4);

        float per = ((marks[0] + marks[1] + marks[2] + marks[3] + marks[4])/totalMarks * 100 )/5.0f;
        if (per >= 60) {
            System.out.println("First Division");
        }
        else if(per >=50){
            System.out.println("Second Division");
        }
        else if (per >= 40) {
            System.out.println("Third Division");
        }
        else{
            System.out.println("Fail...");
        }
        sc.close();
    }
}
