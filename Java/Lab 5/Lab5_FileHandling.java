/* Program to randomly generate
   complex numbers and perform
   operations on them */

import java.util.Random;
import java.io.*;

class Complex {
        
    private double Re, Im;
    private String complexString;
    Random rand = new Random();
        
    public Complex() {
        Re = rand.nextDouble(100);
        Im = rand.nextDouble(100);
        complexString = String.format("%.2f + %.2fi", this.Re, this.Im);
    }
        
    public static Complex sum(Complex A, Complex B) {
        Complex C = new Complex();
        C.Re = A.Re + B.Re;
        C.Im = A.Im + B.Im;
        C.complexString = String.format("%.2f + %.2fi", C.Re, C.Im);
        return C;
    }
        
    public static Complex difference(Complex A, Complex B) {
        Complex C = new Complex();
        C.Re = A.Re - B.Re;
        C.Im = A.Im - B.Im;
        C.complexString = String.format("%.2f + %.2fi", C.Re, C.Im);
        return C;
    }
       
    public static Complex product(Complex A, Complex B) {
        Complex C = new Complex();
        C.Re = A.Re * B.Re - A.Im * B.Im;
        C.Im = A.Re * B.Im - B.Re * A.Im;
        C.complexString = String.format("%.2f + %.2fi", C.Re, C.Im);
        return C;
    }
        
    public static Complex quotient(Complex A, Complex B) {
        Complex C = new Complex();
        C.Re = (A.Re * B.Re - A.Im * B.Im) / (B.Re * B.Re + B.Im * B.Im);
        C.Im = (A.Re * B.Im + A.Im * B.Re) / (B.Re * B.Re + B.Im * B.Im);
        C.complexString = String.format("%.2f + %.2fi", C.Re, C.Im);
        return C;
    }
    
    String getComplex() {
        return complexString;
    }
}
    
public class Lab5_FileHandling {
    public static void main(String[] args) {
            
        //Creating 2 random complex numbers
        Complex C1 = new Complex();
        System.out.println("C1 = " + C1.getComplex());
    
        Complex C2 = new Complex();
        System.out.println("C2 = " + C2.getComplex());
    
        //Performing operations on them
        Complex sum = Complex.sum(C1, C2);
        Complex difference = Complex.difference(C1, C2);
        Complex product = Complex.product(C1, C2);
        Complex quotient = Complex.quotient(C1, C2);

        try (FileWriter f = new FileWriter("Complex_Numbers.txt");
            PrintWriter p = new PrintWriter(f);) {

                p.println("C1 : " + C1.getComplex() + " ; C2 : " + C2.getComplex() + "\n");

                p.print("(" + C1.getComplex() + ") + (" + C2.getComplex() + ") = (");
                p.print(sum.getComplex() + ")\n");

                p.print("(" + C1.getComplex() + ") - (" + C2.getComplex() + ") = (");
                p.print(difference.getComplex() + ")\n");

                p.print("(" + C1.getComplex() + ") * (" + C2.getComplex() + ") = (");
                p.print(product.getComplex() + ")\n");

                p.print("(" + C1.getComplex() + ") / (" + C2.getComplex() + ") = (");
                p.print(quotient.getComplex() + ")");

        } catch (IOException i) {
            i.printStackTrace();
        }

        System.out.println("Operations successfully written to file!");
    }
}