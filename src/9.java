import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int num = rnd.nextInt(100);
        System.out.println("The random number is: " + num);
    }
}
