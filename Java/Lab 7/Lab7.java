/* Program to demonstrate
   the concept of polymorphism */

import java.util.Random;
import java.io.*;

class CalculateSum {

    static int Calculate(int a, int b) {
        return a + b;
    }

    int Calculate(int a, int b, int c) {
        return a + b + c;
    }

    double Calculate(double a, double b) {
        return a + b;
    }
}

class CalculateDifference extends CalculateSum{

    static int Calculate(int a, int b) {
        return a - b;
    }

    double Calculate(double a, double b) {
        return a - b;
    }
}

public class Lab7 {
    public static void main(String[] args) {
        
        /* We have two classes, calculate sum and
           calculate difference.
           They both have overriden and overloaded funtion Calculate.
           We call this function for both classes to observe
           polymorphism in runtime and compile time. */

        //We first create random integer and double values
        Random rand = new Random();
        int I1 = rand.nextInt(50);
        int I2 = rand.nextInt(50);
        int I3 = rand.nextInt(50);
        double D1 = rand.nextDouble(50);
        double D2 = rand.nextDouble(50);

        //Creating objects of both classes
        CalculateSum CS = new CalculateSum();
        CalculateDifference CD = new CalculateDifference();

        //We output into a file called Polymorphism.txt
        try (FileWriter f = new FileWriter("Polymorphism.txt");
            PrintWriter p = new PrintWriter(f);) {

                p.println("The random integers are: ");
                p.println("I1 = " + I1 + "; I2 = " + I2 + "; I3 = " + I3);

                p.println("The random doubles are: ");
                p.printf("D1 = %.2f; D2 = %.2f\n", D1, D2);
                p.println();

                p.println("Calling Calculate function of class CalculateSum:");
                p.println(I1 + " + " + I2 + " = " + CalculateSum.Calculate(I1, I2));
                p.println(I1 + " + " + I2 + " + " + I3 + " = " + CS.Calculate(I1, I2, I3));
                p.printf("%.2f + %.2f = %.2f\n", D1, D2, CS.Calculate(D1, D2));
                p.println();

                p.println("Calling Calculate function of class CalculateDifference:");
                p.println(I1 + " - " + I2 + " = " + CalculateDifference.Calculate(I1, I2));
                p.printf("%.2f - %.2f = %.2f\n", D1, D2, CD.Calculate(D1, D2));
                p.println();

                p.println("Using Dynamic Method Dispatch:");
                CalculateSum dynamic = new CalculateDifference();
                p.println(I2 + " + " + I3 + " = " + dynamic.Calculate(I2, I3));
                p.printf("%.2f - %.2f = %.2f\n", D1, D2, dynamic.Calculate(D1, D2));
                p.print(I1 + " + " + I2 + " + " + I3);
                p.print(" = " + dynamic.Calculate(I1, I2, I3));

                System.out.println("File Polymorphism.txt created and written.");


        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}