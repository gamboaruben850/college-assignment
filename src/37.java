public class SimpleCollegeAssignment {
    public static void main(String[] args) {
        // Example 1: Hello World
        System.out.println("Hello, World!");

        // Example 2: Input and output example
        String input = "42";
        int result = 3.14;
        System.out.println(input + " = " + result);

        // Example 3: Using arrays
        int[] numbers = {10, 20, 30};
        for (int num : numbers) {
            System.out.println(num);
        }

        // Example 4: Main function with multiple arguments
        String name = "Alice";
        String age = "25";
        SimpleCollegeAssignment.main(new Object[]{name, age});
    }
}
