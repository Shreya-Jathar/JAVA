/* Program to create complex class
   with operator overloading and type conversion */

import java.util.Scanner;
import java.util.regex.Pattern;

class Complex {
   private double Re, Im;

   public Complex() {
      this(0, 0);
   }

   public Complex(String S) {
      String[] arr = S.split(Pattern.quote("+i"));

      this.Re = Double.parseDouble(arr[0]);
      this.Im = Double.parseDouble(arr[1]);
   }

   public Complex (int Re, int Im) {
      this((double)Re, (double)Im);
   }

   public Complex (double Re, double Im) {
      this.Re = Re;
      this.Im = Im;
   }

   public void printComplex() {
      System.out.printf("%.2f + %.2fi\n", this.Re, this.Im);
   }

   public static void sum(Complex A, Complex B) {
      Complex C = new Complex();
      C.Re = A.Re + B.Re;
      C.Im = A.Im + B.Im;

      C.printComplex();
   }

   public static void difference(Complex A, Complex B) {
      Complex C = new Complex();
      C.Re = A.Re - B.Re;
      C.Im = A.Im - B.Im;

      C.printComplex();
   }

   public static void product(Complex A, double x) {

      Complex C = new Complex(A.Re * x, A.Im * x);
      C.printComplex();
   }

   public static void product(Complex A, Complex B) {
      Complex C = new Complex();
      C.Re = A.Re * B.Re - A.Im * B.Im;
      C.Im = A.Re * B.Im - B.Re * A.Im;

      C.printComplex();
   }

   public static void quotient(Complex A, double x) {

      Complex C = new Complex(A.Re / x, A.Im / x);
      C.printComplex();
   }

   public static void quotient(Complex A, Complex B) {
      Complex C = new Complex();
      C.Re = (A.Re * B.Re - A.Im * B.Im) / (B.Re * B.Re + B.Im * B.Im);
      C.Im = (A.Re * B.Im + A.Im * B.Re) / (B.Re * B.Re + B.Im * B.Im);

      C.printComplex();
   }
}

public class Lab4 {
   public static void main(String[] args) {
      
      try(Scanner sc = new Scanner(System.in)) {

         //Creating a complex number using integer parameters
         System.out.print("Integer values of Re and Im : ");
         int Re1 = sc.nextInt();
         int Im1 = sc.nextInt();

         Complex C1 = new Complex(Re1, Im1);

         //Creating a complex number using double parameters
         System.out.print("Double values of Re and Im : ");
         double Re2 = sc.nextDouble();
         double Im2 = sc.nextDouble();

         Complex C2 = new Complex(Re2, Im2);

         //Creating a complex number using a string
         System.out.print("Type a complex number : ");
         String complex = sc.next();
         Complex C3 = new Complex(complex);
         System.out.println();

         //Printing the 3 complex numbers
         System.out.print("C1 : ");
         C1.printComplex();
         System.out.print("C2 : ");
         C2.printComplex();
         System.out.print("C3 : ");
         C3.printComplex();
         System.out.println();

         //Performing basic operations
         System.out.println("Sum and difference of C1 and C2 :");
         Complex.sum(C1, C2);
         Complex.difference(C1, C2);
         System.out.println();

         System.out.println("Product of C3 and 2.5 :");
         Complex.product(C3, 2.5);
         System.out.println("Product of C1 and C3 :");
         Complex.product(C1, C3);
         System.out.println();

         System.out.println("Quotient of C2 divided by 2.5 :");
         Complex.quotient(C2, 2.5);
         System.out.println("Quotient of C3 divided by C2 :");
         Complex.quotient(C3, C2);
         System.out.println();
      }
   }
}