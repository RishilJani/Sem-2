import java.util.Scanner;
class Vovel{
    int vov;
    public void count(String str){
        int i=0,vov=0;
        int subindex = str.indexOf("quit");

        if(subindex != -1){
            while(i<subindex){
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) =='u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) =='U' ){
                   vov++;
                }
                i++;
            }
            vov +=2;
            System.out.println("no of vovels = "+vov);
        }
        else{
            System.out.println("\"quit\" required");
        }
        
    }
    
}
public class J0503Vovel{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        Vovel v = new Vovel();
        v.count(str);
        sc.close();
    }
}