import java.util.Random;

public class CollegeAssignment {
    public static void main(String[] args) {
        Random rand = new Random();
        int n1 = rand.nextInt(10);
        int n2 = rand.nextInt(10);
        System.out.println("The sum of " + n1 + " and " + n2 + " is " + (n1 + n2));
    }
}
