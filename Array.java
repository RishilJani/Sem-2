public class Array {
    public static void main(String[] args) {
        int i, j, n =10, a =0 ;

        for (i = 1; i < 5; i++) {
            if (i%2 != 0) {
                for(j = 1;j <= i ; j++){
                    System.out.print(n-a + " ");
                    a++;
                }
                System.out.println();
                
            }
            else{
                for(j=1; j <=i ; j++){
                    System.out.print(n-a + " ");
                    a++;
                }
                System.out.println();
                
            }
        }

    }    
}
/*
 1* 10
 2* 8 9
 3* 7 6 5
 4* 1 2 3 4
 */