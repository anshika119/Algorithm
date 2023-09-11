public class FibonacciIterative {
    public static void main(String[] args) {
        int n = 10; // Change 'n' to the desired number of Fibonacci numbers
        
        long[] fibonacci = new long[n];
        
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        System.out.println("Fibonacci Series (Iterative):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
