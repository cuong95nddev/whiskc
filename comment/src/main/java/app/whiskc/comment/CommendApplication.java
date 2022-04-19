package app.whiskc.comment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CommendApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommendApplication.class, args);
    }


    @GetMapping("/")
    public String hello() {
        return "Hello Comment service!";
    }
}
