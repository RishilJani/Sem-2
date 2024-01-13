import java.util.Scanner;
class Vovel{
    int vov;
    public void count(String str){
        int i= 0;
        while(i<str.length()){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) =='u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) =='U' ){
               this.vov++;
            }
            
            if(str.charAt(i) == 'q' && str.charAt(i+1) == 'u' && str.charAt(i+2) == 'i' && str.charAt(i+3) == 't'){
                this.vov += 2;
                System.out.println(vov);
                
                return;
            }
            i++;
        }
        System.out.println("\"quit\" required");
    }
    
    
}
public class J0503Vovel{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        Vovel v = new Vovel();
        v.count(str);
        
    }
}
