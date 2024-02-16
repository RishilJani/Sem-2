import java.util.Scanner;

class NegativeNum extends Exception {
    public NegativeNum(String str) {
        System.out.println(str);
    }
}

class Dividable extends Exception {
    public Dividable(String str) {
        System.out.println(str);
    }
}
class GreaterNum extends Exception{
    public GreaterNum(String str){
        System.out.println(str);
    }
}
class NumNotInRange extends Exception{
    public NumNotInRange(String str){
        System.out.println(str);
    }
}
public class J0802Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            try {
                if(arr[i] < 0){
                    throw new NegativeNum("Negative number at " + i);
                }
                else if(arr[i] % 10 == 0){
                    throw new Dividable("Dividable by 10 at " + i);
                }
                else if(arr[i] > 7000){
                    throw new GreaterNum("Number is greater than 7000 at " + i );
                }
                else if(arr[i] >1000 && arr[i] < 2000){
                    throw new NumNotInRange("Number is > 1000 and < 2000 at "+ i);
                }
                else{
                    sum += arr[i];
                }
            } 
            catch (NegativeNum e) { }
            catch (Dividable d){  }
            catch (GreaterNum g){  }
            catch (NumNotInRange r){  }
        }

        System.out.println( "Sum = " + sum);

        sc.close();
    }
}


/* */