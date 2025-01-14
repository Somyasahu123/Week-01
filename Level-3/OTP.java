import java.util.HashSet;
import java.util.Random;

public class OTP{

    public static void main(String[] args) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int otp = generateOTP();
            while (!otpSet.add(otp)) { // Ensure uniqueness
                otp = generateOTP();
            }
            System.out.println("Generated OTP: " + otp);
        }
    }

    public static int generateOTP() {
        Random rand = new Random();
        return 100000 + rand.nextInt(900000); // Generate a 6-digit OTP
    }
}
