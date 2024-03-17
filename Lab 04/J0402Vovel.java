import java.util.Scanner;

public class J0402Vovel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int vov = 0,con = 0 ;
        for (int i = 0;i<str.length() ; i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) =='u' ){
                vov++;
            }
            else{
                con++;
            }
        }
        System.out.println("vovel = "+ vov + "  Con = " + con);
        sc.close();
    }
}
