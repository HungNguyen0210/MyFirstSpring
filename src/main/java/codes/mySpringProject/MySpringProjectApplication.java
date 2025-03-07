package codes.mySpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringProjectApplication {

    public static void main(String[] args) {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        SpringApplication.run(MySpringProjectApplication.class, args);
    }

}