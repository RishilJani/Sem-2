/*Write a complete multi-threaded program to meet following requirements: 
    i. Read matrix [A] m x n
    ii. Create m number of threads
    iii. Each thread computes summation of elements of one row, i.e. ith row of the matrix is processed by ith thread. Where 
        0 <= i< m.
    iv. Print the results.
 */

import java.util.Scanner;

class Sum extends Thread {
    int[][] A;
    int row;
    int ans;

    Sum(int[][] A, int row) {
        this.A = A;
        this.row = row;
    }

    public void run() {
        ans = 0;
        for (int i = 0; i < A[row].length; i++) {
            ans += A[row][i];
        }
    }
    int getSummation(){
        return ans;
    }
}

public class J0903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m and n= ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int A[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("A[%d][%d] = ", i, j);
                A[i][j] = sc.nextInt();
            }
        }
        Sum[] s1 = new Sum[m];
        for (int i = 0; i < m; i++) {
            s1[i] = new Sum(A, i);
            s1[i].start();
        }
        for (int i = 0; i < m; i++) {
            try {
                s1[i].join(); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.printf("Sum of %d row = %d \n",i,s1[i].getSummation());
        }
        sc.close();
    }
}
