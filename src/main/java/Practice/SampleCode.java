package Practice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SampleCode {
    public static void main(String[] args) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println("Hello World");
        System.out.println(encoder.encode("doumoto99"));

    }
}
