
import java.util.Scanner;
public class J0403Array
{
	public static void main(String[] args) {
	   int[] arr = new int[4];
	   float avg = 0f;
	   Scanner sc = new Scanner(System.in);
	   for (int i=0;i<4 ;i++ ) {
	       System.out.printf("Enter arr[%d] : ",i);
	       arr[i] = sc.nextInt();
	       avg += arr[i];
	   }
	   
	   avg = avg / 4.0f;
	   System.out.print("Average = "+ avg);
	}
}
