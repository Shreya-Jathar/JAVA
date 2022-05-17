/* Program to randomly generate
   complex numbers and perform
   operations on them */

import java.util.Random;

class Complex {
    private double Re, Im;
    Random rand = new Random();
 
    public Complex() {
        Re = rand.nextDouble(100);
        Im = rand.nextDouble(100);
    }

    public void printComplex() {
        System.out.printf("%.2f + %.2fi", this.Re, this.Im);
    }
  
    public static void sum(Complex A, Complex B) {
        Complex C = new Complex();
        C.Re = A.Re + B.Re;
        C.Im = A.Im + B.Im;
        
        System.out.print("(");
        A.printComplex();
        System.out.print(") + (");
        B.printComplex();
        System.out.print(") = ");

        C.printComplex();
    }
  
    public static void difference(Complex A, Complex B) {
        Complex C = new Complex();
        C.Re = A.Re - B.Re;
        C.Im = A.Im - B.Im;

        System.out.print("(");
        A.printComplex();
        System.out.print(") - (");
        B.printComplex();
        System.out.print(") = ");
  
        C.printComplex();
    }
 
    public static void product(Complex A, Complex B) {
        Complex C = new Complex();
        C.Re = A.Re * B.Re - A.Im * B.Im;
        C.Im = A.Re * B.Im - B.Re * A.Im;

        System.out.print("(");
        A.printComplex();
        System.out.print(") * (");
        B.printComplex();
        System.out.print(") = ");

        C.printComplex();
    }
  
    public static void quotient(Complex A, Complex B) {
        Complex C = new Complex();
        C.Re = (A.Re * B.Re - A.Im * B.Im) / (B.Re * B.Re + B.Im * B.Im);
        C.Im = (A.Re * B.Im + A.Im * B.Re) / (B.Re * B.Re + B.Im * B.Im);

        System.out.print("(");
        A.printComplex();
        System.out.print(") / (");
        B.printComplex();
        System.out.print(") = ");
  
        C.printComplex();
    }
}

public class Lab5 {
    public static void main(String[] args) {
        
        //Creating 2 random complex numbers
        Complex C1 = new Complex();
        C1.printComplex();
        System.out.println();

        Complex C2 = new Complex();
        C2.printComplex();
        System.out.println();
        System.out.println();

        //Performing operations on them
        Complex.sum(C1, C2);
        System.out.println();

        Complex.difference(C1, C2);
        System.out.println();

        Complex.product(C1, C2);
        System.out.println();
        
        Complex.quotient(C1, C2);
        System.out.println();
    }
}