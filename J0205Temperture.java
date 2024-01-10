// Write a program to convert temperature from Fahrenheit to Celsius.

import java.util.Scanner;
public class J0205Temperture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Fahrenheit: ");
        float f = sc.nextFloat();

        float c = (f - 32) * (5/9);

        System.out.println("Celsius = " + c);
        sc.close();
    }
}
