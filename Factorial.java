/**
Adam Epstein
1/31/19
This programs calculates the factorial of a number recursively and iteratively.
 */
public class Factorial {

    public int factorial(int n, String type) {
        
        if (type.equals("iterative")) {
            return factorial_iterative(n);
        }

        else if (type.equals("recursive")) {
            return factorial_recursive(n);
        }

        else {
            return -1;
        }
        
    }

    public int factorial_iterative(int n) {

        int total = 1;

        for (int i = 1; i <= n; i++) {
            total = i * total;
        }
        return total;
    }

    public int factorial_recursive(int n) {

        if (n <= 1) {
            return 1;
        }
        return n * factorial_recursive(n - 1);
    }
}
