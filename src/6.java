import java.util.Random;

class RandomCode {
    public static void main(String[] args) {
        // Generate a random number between 1 and 10
        int randomNumber = new Random().nextInt(10);

        // Print the result
        System.out.println("The random number is: " + randomNumber);
    }
}