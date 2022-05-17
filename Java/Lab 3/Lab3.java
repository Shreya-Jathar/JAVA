/* Program to illustrate constructors */

import java.util.Scanner;

class Shape {
    double side, height;

    public Shape() {
        this(4, 0);

        System.out.println("Chaining back...");
        System.out.println("Inside the default constructor");
    }

    public Shape(double S) {
        this(S, 0);
        System.out.println("Chaining back...");
        System.out.println("Inside the parameterized constructor");
        System.out.println("This constructor has 1 parameter");
    }
    
    public Shape(double S,  double H) {
        System.out.println("Inside the parameterized constructor");
        System.out.println("This constructor has 2 parameters");

        side = S;
        height = H;
    }

    Shape(Shape s) {
        System.out.println("Inside the copy constructor");

        this.side = s.side;
        this.height = s.height;
    }

    public void printArea() {
        if(this.height == 0) {
            System.out.println("The shape is a square");
            System.out.println("Area = " + side * side);
            System.out.println();
            return;
        }

        System.out.println("The shape is a cuboid");
        System.out.println("Volume = " + side * side * height);
        System.out.println();
    }
}

public class Lab3 {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)) {

            //Creating a shape using default constructor
            Shape S1 = new Shape();
            S1.printArea();

            //Creating a shape using parameterized constructor
            //Single parameter
            System.out.println("Enter value of side :");
            double side1 = sc.nextDouble();
            Shape S2 = new Shape(side1);
            S2.printArea();

            //Creating a shape using parameterized constructor
            //Two parameters
            System.out.println("Enter value of side and height:");
            double side2 = sc.nextDouble();
            double height2 = sc.nextDouble();
            Shape S3 = new Shape(side2, height2);
            S3.printArea();

            //Creating a shape using copy constructor
            //S4 is a copy of S3
            Shape S4 = new Shape(S3);
            S4.printArea();
        }
    }
}