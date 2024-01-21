/* Declare a class called student having following data members:id_no, no_of_subjects_registered, subject_code, 
subject_credits, grade_obtained and spi. Deƒne constructor and calculate_spi methods.Deƒine main to instantiate an array 
for objects of class student to process data of n students to be given as command line arguments.*/
class Student{
    int id_no;
    int no_of_subjects_registered;
    String subject_code;
    int subject_credits;
    char grade_obtained;
    float spi;
    Student(){
        id_no = 000;
        no_of_subjects_registered = 4;
        subject_code = "2301CS201";
        subject_credits = 5;
        grade_obtained = 'A';

    }
    public float calculate_spi(){
        float num = 0f;
        num = grade_obtained - (55 + (grade_obtained - 65)*2);
        // 65 - 10 (55)
        // 66 - 9 (57)
        // 67 - 8... (59)

        // num = go - (n +(go - 65)*2);
        return num;
    }
}
public class J0601Student{
    public static void main(String[] args) {
        // Student[] std = new Student[Integer.parseInt(args[0])];
        // Student std = new Student();
        // std.grade_obtained = 'D' ;
        // float f1 = std.calculate_spi();
        // System.out.println(f1);
    }
}
