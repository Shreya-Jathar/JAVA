/* Program to illustrate
   inheritance */

class Polygon {

    public Polygon() {
        System.out.println("I am a Polygon");
    }

    public void Sides() {
        System.out.println("I have n sides");
    }

    public void Area() {
        System.out.print("Area of polygon = ");
        System.out.println("(perimeter * apothem) / 2\n");
    }
}

class Triangle extends Polygon{
    public Triangle() {
        System.out.println("I am a triangle");
    }

    public void Sides() {
        super.Sides();
        System.out.println("n = 3");
    }

    public void Area() {
        System.out.println("Area of triangle = (base * height)/2\n");
    }
}

class Rectangle extends Polygon{
    public Rectangle() {
        System.out.println("I am a Rectangle");
    }

    public void Sides() {
        super.Sides();
        System.out.println("n = 4");
    }

    public void Area() {
        System.out.println("Area of rectangle = base * height\n");
    }
}

class Square extends Rectangle {
    public Square() {
        System.out.println("I am a Square");
    }

    public void Sides() {
        super.Sides();
        System.out.println("My sides are equal");
    }

    public void Area() {
        System.out.println("Area of a square = side * side\n");
    }
}

public class Lab6 {
    public static void main(String[] args) {

        System.out.println("Polygon :");
        Polygon P = new Polygon();
        P.Sides();
        P.Area();

        System.out.println("Rectangle :");
        Rectangle R = new Rectangle();
        System.out.println();
        R.Sides();
        R.Area();
        
        System.out.println("Square :");
        Square S = new Square();
        System.out.println();
        S.Sides();
        S.Area();
        System.out.println();
        
        System.out.println("Triangle :");
        Triangle T = new Triangle();
        System.out.println();
        T.Sides();
        T.Area();
    }
}