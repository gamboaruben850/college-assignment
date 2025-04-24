public class CollegeAssignment {
    public static void main(String[] args) {
        // Example of a simple Java program to calculate the factorial of a number
        int number = 5;
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    // Function to calculate factorial
    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
