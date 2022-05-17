/* Program to find
   - Total
   - Average
   of 2 numbers using a function with
   - Default arguments
   - this keyword */

import java.util.Scanner;

class Total {

    float A, B;

    public Total() {
        this.A = 2;
        this.B = 3;
    }

    public Total(float x, float y) {
        this.A = x;
        this.B = y;
    }

    float total() {
        return A + B;
    }

    float average() {
        return this.total() / 2;
    }

    //Static methods for the same functions
    public static float total(float A, float B) {
        return A + B;
    }

    public static float average(float A, float B) {
        return total(A, B) / 2;
    }
}

public class Lab1 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Total t1 = new Total();

            System.out.println("Using default values : ");
            System.out.println("A = " + t1.A + " and B = " + t1.B);
            System.out.println("Total = " + t1.total());
            System.out.println("Average = " + t1.average());
            System.out.println();
            
            System.out.println("Enter 2 numbers");
            float A = sc.nextFloat();
            float B = sc.nextFloat();
            System.out.println();

            Total t2 = new Total(A, B);

            System.out.println("Using values taken from user : ");
            System.out.println("A = " + t2.A + " and B = " + t2.B);
            System.out.println("Total = " + t2.total());
            System.out.println("Average = " + t2.average());
            System.out.println();

            System.out.println("Using values taken from user and using static methods : ");
            System.out.println("A = " + A + " and B = " + B);
            System.out.println("Total = " + Total.total(A, B));
            System.out.println("Average = " + Total.average(A, B));
        }
        System.out.println();
    }
}