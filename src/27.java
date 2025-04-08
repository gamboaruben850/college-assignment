public class SimpleCollegeAssignment {
    public static void main(String[] args) {
        // Example: Calculate the sum of two numbers
        int num1 = 5;
        int num2 = 7;
        int result = num1 + num2;

        System.out.println("The sum is: " + result);
        
        // Another example: Print a message with user input and output
        String userName = getUserInput();
        if (userName.equals("student")) {
            System.out.println("Welcome, student!");
        } else {
            System.out.println("Hello, " + userName + "!");
        }
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }
}
