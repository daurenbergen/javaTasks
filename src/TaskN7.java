public class TaskN7 {
    /*
    Write a Java Program to print the first 10 numbers of Fibonacci series.
     */
    public static void main(String[] args) {

        int n = 10; // Number of Fibonacci numbers to print

        long[] fibonacci = new long[n];

        // The first two numbers in the Fibonacci sequence
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Generate the Fibonacci sequence
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Print the first 10 Fibonacci numbers
        System.out.println("The first " + n + " numbers of the Fibonacci series are:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }

    }
}
