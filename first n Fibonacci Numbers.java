import java.util.Scanner;

public class Fibonacci {
    public static long[] printFibb(int n) {
        long[] fib = new long[n];
        if (n >= 1) {
            fib[0] = 1;
        }
        if (n >= 2) {
            fib[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();

        long[] fib = printFibb(n);
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}





// The time complexity of the algorithm used to print the first n Fibonacci numbers in Java using Dynamic Programming is O(n), where n is the input size. This is because the algorithm uses Dynamic Programming to compute the Fibonacci numbers iteratively, and each iteration takes constant time. Therefore, the total time taken by the algorithm is proportional to the input size n.

// The space complexity of the algorithm is also O(n), as we are storing the first n Fibonacci numbers in an array of size n. Therefore, the space required by the algorithm is proportional to the input size n.

// Both the time and space complexity of the algorithm are optimal for this problem, as we cannot compute the Fibonacci numbers with better time or space complexity than O(n) using Dynamic Programming.
