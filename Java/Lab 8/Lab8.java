/* Program to illustrate
   method overriding */

class Store {

    public Store() {
        System.out.println("Welcome to the store!");
    }

    public void Sell() {
        System.out.println("This is a general store.");
        System.out.println("It sells everything");
    }

    protected void Exit() {
        System.out.println("Thank you for visiting");
    }
}

class BookStore extends Store {

    public BookStore() {
        System.out.println("This one is a book store");
    }

    public void Sell() {
        System.out.println("It sells books and stationary");
    }
}

public class Lab8 {
    public static void main(String[] args) {
        
        Store S = new Store();
        S.Sell();
        S.Exit();
        System.out.println();

        BookStore BS = new BookStore();
        BS.Sell();
        BS.Exit();
        System.out.println();
    }
}