package lat.ahsokavoice.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AhsokaVoiceApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AhsokaVoiceApiApplication.class, args);
    }

    @Value("${value.prueba}")
    private String helloWorld;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(helloWorld);
    }
}
