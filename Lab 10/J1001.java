import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J1001 {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        File f1 = new File("J1001.txt");
        int line = 0,words = 0;
        try {
            String str = "",str2 = "";
            Scanner sc = new Scanner(f1);
            
            while (sc.hasNextLine()) {
                str += sc.nextLine();
                line++;
            }      
            sc = new Scanner(str);
            while (sc.hasNext()) {
                str2 = sc.next() + " ";
                words++;
            }
            sc.close();
            System.out.println("Lines = " + line);
            System.out.println("Char = " + str.length());
            System.out.println("Words = " + words);
        } 
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
