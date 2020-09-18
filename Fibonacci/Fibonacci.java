
public class Fibonacci {

    /**
     * Compute the nth number of Fibonacci sequence.
     * Notice: F(0) = 0 and F(1) = 1;
     * @param N
     * @return the nth Fibonacci number.
     */
    public static int computeFibonacci(int N) {
        if (N > 40)
            throw new AssertionError("Number is too large!");
        if (N <= 1) {
            return N;
        } else {
            return computeFibonacci(N-2) + computeFibonacci(N-1);
        }

    }

    /**
     * Print Fibonacci sequence with length of n.
     * @param N
     */
    public static void drawFibonacci(int N) {
        // TODO Fill your code to print the Fibonacci sequence.
        // Hint: Use computeFibonacci method.
        for (int i = 0; i<N; i++){
            System.out.print(computeFibonacci(i)+" ");
        }

    }
}
