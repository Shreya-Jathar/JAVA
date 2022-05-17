import java.util.Scanner;

public class Lab10_2D {
    public static void main(String[] args) {

        int[][] A = new int[][] {{1, 7, 3}, {9, 4, 5}, {5, 0, 7}};
        int i, j;
        int sum = 0;
        int min = A[0][0], max = A[0][0];

        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("\nArray A: ");
            for(i = 0; i < A.length; i++) {
                for(j = 0; j < A[i].length; j++) {
                    sum += A[i][j];
                    System.out.print(A[i][j] + " ");

                    if(A[i][j] < min)
                        min = A[i][j];

                    if(A[i][j] > max)
                        max = A[i][j];
                }
                System.out.println();
            }

            System.out.println("Array Length: " + A.length * (A[0].length));
            System.out.println("Sum of elements: " + sum);
            System.out.println("Maximum value in A: " + max);
            System.out.println("Minimum value in A: " + min);

            //Finding a given element in an array, and printing its position
            int posi = -1, posj = -1;
            System.out.print("\nElement to be found (A4): ");
            int element = sc.nextInt();

            for(i = 0; i < A.length; i++) {
                for(j = 0; j < A[i].length; j++) {
                    if(A[j][i] == element) {
                        posi = i;
                        posj = j;
                    }
                }
            }

            if(posi == -1)
                System.out.println("Element " + element + " not found");
            else {
                posi ++; posj ++;
                System.out.print("Element " + element);
                System.out.println(" found at position " + posj + ", " + posi);
                System.out.println();
            }
        }
    }
}
