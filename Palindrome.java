import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int a,i,r=0;
        a = num;
        while (num>0) {
            i = num%10;
            r = r * 10 + i;
            num = num / 10;
        }
        if(a == r){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
        sc.close();
    }
}
