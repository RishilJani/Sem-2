/* Deƒne class for Complex number with real and imaginary as data members. Create its contructor, overload the constructors. 
Also deƒne addition method to add two complex objects. */

import java.util.Scanner;

class Complex{
    float real;
    float imaginary;

    // First Contructor
    Complex(){
        real = 0;
        imaginary = 0.0f;
    }
    // Second Constructor
    Complex(float i,float f1){
        real = i;
        imaginary = f1;
    }

    public Complex addComplex(Complex c2){
            Complex c3 = new Complex(0,0f);

            c3.real = this.real + c2.real;
            c3.imaginary = this.imaginary + c2.imaginary ;

           return new Complex(c3.real,c3.imaginary);
    }
}

public class J0505Complex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st real no and imainary no : ");
        Complex c1 = new Complex(sc.nextFloat(),sc.nextFloat());

        System.out.println("Enter 2ed real no and imainary no : ");
        Complex c2 = new Complex(sc.nextFloat(),sc.nextFloat());

        Complex c3 = new Complex();
        c3 = c1.addComplex(c2);
        
        System.out.println("addition = " + c3.real + " + i* "+ c3.imaginary);
        sc.close();
    }
}