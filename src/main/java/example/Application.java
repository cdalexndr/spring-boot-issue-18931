package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.UUID;

@SpringBootApplication
@EnableAsync(mode = AdviceMode.ASPECTJ)
public class Application {
    public static final String RESPONSE = UUID.randomUUID().toString();

    public static void main( String[] args ) {
        SpringApplication.run( Application.class, args );
    }
}
