import java.util.Random;
public class GenerateRandomCode {
    public static void main(String[] args) {
        Random r = new Random();
        int code = r.nextInt(999999 - 100000 + 1) + 100000;
        System.out.println("Your random code is: " + code);
    }
}
