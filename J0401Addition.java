
import java.util.Scanner;
public class J0401Addition{
    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        System.out.println("Addition by command line = "+(a+b));

        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter first num: ");
        a = sc.nextDouble();
        System.out.println("Enter second num: ");
        b = sc.nextDouble();

        System.out.println("Addition by Scanner class = "+(a+b));
        sc.close();

    }
}
/*
 10
 8 9
 7 6 5
 1 2 3 4
 */
