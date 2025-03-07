package codes.mySpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MySpringProjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MySpringProjectApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }
}