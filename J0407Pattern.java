
public class J0407Pattern {
    public static void main(String[] args) {
        String str = "stream";
        int i,j;
        for(i=0;i<str.length();i++){
            for(j=0;j<=i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println("");
        }
    }
    
}
