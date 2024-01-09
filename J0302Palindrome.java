import java.util.Scanner;
public class J0302Palindrome {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. String \n2. number ");
            
            int n = sc.nextInt();
            if (n==2) {
                System.out.print("Enter a num: ");
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
            }
            else{
                System.out.print("Enter a String:");
                String str = sc.next();
                boolean flag = true;
            
                for (int i = 0; i < str.length()/2; i++) {
                   if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                        flag = false;
                        break;
                    }
                }
                
                if(flag){
                    System.out.println("palindrome");
                }
                else{
                    System.out.println("not palindrome");
                }
            }
        sc.close();
    }
}
