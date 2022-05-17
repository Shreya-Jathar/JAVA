import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* Program to illustrate
   Array Manipulations */

public class Lab10_1D {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            Integer[] A1 = new Integer[] {1, 4, 0, 6, 3, 9};
            int[] A2 = new int[] {2, 5, 9, 8, 1, 5};
            int[] A3 = new int[] {};
            int i, sum = 0;

            System.out.print("\nArray A1: ");
            for(int k: A1) {
                System.out.print(k + " ");
                sum = sum + k;
            }

            //Sorting an array
            Arrays.sort(A1);
            System.out.print("\nA1 after sorting (ascending): ");
            for(int k: A1)
                System.out.print(k + " ");

            Arrays.sort(A1, Collections.reverseOrder());
            System.out.print("\nA1 after sorting (descending): ");
            for(int k: A1) {
                System.out.print(k + " ");
            }

            //Finding length of an array
            System.out.println("\nArray Length (A1): " + A1.length);
            //Finding sum of all elements of an array
            System.out.println("Sum of all elements in A1: " + sum);

            System.out.print("\nArray A2: ");
            for(int k: A2) {
                System.out.print(k + " ");
            }

            System.out.print("\n\nArray A3: ");
            for(int k: A3) {
                System.out.print(k + " ");
            }

            System.out.print("\nIs A3 Empty? ");
            System.out.println(A3.length == 0 || A3 == null);

            //Appending an element to an array
            System.out.println("\nAppending 6 to A2 and assigning it to A3");
            A3 = Arrays.copyOf(A2, A2.length + 1);
            A3[A3.length - 1] = 6;
            System.out.print("Array A3: ");
            for(int k: A3) {
                System.out.print(k + " ");
            }

            int temp, len = A3.length;
            //Reversing an array
            for(i = 0; i < len / 2; i++) {
                temp = A3[i];
                A3[i] = A3[len - 1 - i];
                A3[len - 1 - i] = temp;
            }

            System.out.print("\nArray A3 reversed: ");
            for(int k: A3) {
                System.out.print(k + " ");
            }

            //Adding two arrays
            System.out.print("\n\nA1 + A2: ");
            if(A1.length != A2.length)
                System.out.println("Addition not possible!");
            else {
                for(i = 0; i < A2.length; i++)
                    System.out.printf("%d ", (A1[i] + A2[i]));
            }

            //Finding min and max values of array
            int min = A2[0], max = A2[0];
            for(int k: A2) {
                if(k < min)
                    min = k;

                if(k > max)
                    max = k;
            }
            System.out.println("\n\nMinimum value in A2: " + min);
            System.out.println("Maximum value in A2: " + max);

            //Finding a given element in an array, and printing its position
            int pos = -1;
            System.out.print("\nElement to be found (A2): ");
            int element = sc.nextInt();

            for(i = 0; i < A2.length; i++) {
                if(A2[i] == element)
                    pos = i;
            }

            if(pos == -1)
                System.out.println("Element " + element + " not found");
            else {
                pos ++;
                System.out.print("Element " + element);
                System.out.println(" found at position " + pos);
                System.out.println();
            }
        }
    }
}