class Person {
    private int age;
    private String name;

    public Person(int A, String N) {
        age = A;
        name = N;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int rollNo;
    private String branch;

    public Student(int A, String N, int R, String B) {
        super(A, N);
        rollNo = R;
        branch = B;
    }

    public void display() {
        super.display();
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Branch: " + branch);
    }
}

class Employee extends Person {
    private int empID;
    private String DOJ;

    public Employee(int A, String N, int E, String D) {
        super(A, N);
        empID = E;
        DOJ = D;
    }

    public void display() {
        super.display();
        System.out.println("Employee ID: " + empID);
        System.out.println("Date of Joining: " + DOJ);
    }
}

class Staff extends Employee {
    private String designation;

    public Staff(int A, String N, int E, String D, String Des) {
        super(A, N, E, D);
        designation = Des;
    }

    public void display() {
        super.display();
        System.out.println("Designation: " + designation);
    }
}

class Faculty extends Employee {
    private String designation;

    public Faculty(int A, String N, int E, String D, String Des) {
        super(A, N, E, D);
        designation = Des;
    }

    public void display() {
        super.display();
        System.out.println("Designation: " + designation);
    }
}

public class MainDemoClass {
    public static void main(String[] args) {
        
        Person P = new Person(18, "Shreya");
        Student S = new Student(18, "Dohit", 20124028, "IT");
        Employee E = new Employee(27, "Aarush", 20124001, "20-01-2012");
        Staff St = new Staff(27, "Aashima", 20124002, "20-02-2012", "technical");
        Faculty F = new Faculty(28, "Vaiibhav", 20124108, "15-03-2015", "Professor");

        System.out.println("Person:");
        P.display();
        System.out.println();

        System.out.println("Student:");
        S.display();
        System.out.println();

        System.out.println("Employee:");
        E.display();
        System.out.println();

        System.out.println("Staff:");
        St.display();
        System.out.println();

        System.out.println("Faculty:");
        F.display();
        System.out.println();
    }
}