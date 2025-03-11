import java.security.SecureRandom;

public class OTPGenerator {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int otp = 100000 + random.nextInt(900000); // Ensures a 6-digit number
        System.out.println("Your OTP is: " + otp);
    }
}
