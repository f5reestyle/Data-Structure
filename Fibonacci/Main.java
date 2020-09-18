import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String command = sc.next();

            if ("number".equals(command)) {
                int n = sc.nextInt();
                Fibonacci obj = new Fibonacci();
                int result = obj.computeFibonacci(n);
                System.out.print(result);

                }
                // TODO Fill your code to compute and print a binomial coefficient.

            else if ("print".equals(command)) {
                int n = sc.nextInt();
                Fibonacci obj = new Fibonacci();
                obj.drawFibonacci(n);
                //TODO Fill your code to print the Fibonacci sequence.

            } else {
                throw new AssertionError("Invalid input!");
            }
        }
    }

}
