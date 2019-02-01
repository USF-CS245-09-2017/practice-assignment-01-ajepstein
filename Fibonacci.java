/**
Adam Epstein
1/31/19
This programs calculates the fibonacci sequence of a number recursively and iteratively.
 */
public class Fibonacci {

    public int fibonacci (int n, String type) {

        if (type.equals("iterative")) {
            return fibonacci_iterative(n);
        }
        
        else if (type.equals("recursive")) {
            return fibonacci_recursive(n);
        }

        else {
            return -1;
        }
        
    }

    public int fibonacci_iterative(int n) {

        int firstnum = 0; 
        int secondnum = 1;
        int result = 1;

        if (n == 0) {
            return 0;
        }

        else if(n == 1) {
            return 1;
        }
        
        for (int i = 2; i < n; i++) {
            firstnum = secondnum;
            secondnum = result;
            result = firstnum + secondnum;
        }
        return result;
    }

    public int fibonacci_recursive(int n) {
        
        if (n <= 1) {
            return n;
        }
        return fibonacci_recursive(n-1) + fibonacci_recursive(n - 2);
    }
}
