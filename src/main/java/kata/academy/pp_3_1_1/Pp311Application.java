package kata.academy.pp_3_1_1;

import kata.academy.pp_3_1_1.model.User;
import kata.academy.pp_3_1_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pp311Application {

    private static UserService userService;

    @Autowired
    public Pp311Application(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Pp311Application.class, args);
        
        userService.addUser(new User("Aleksandr", "Pushkin"));
        userService.addUser(new User("Mikhail", "Lermontov"));
    }

}
