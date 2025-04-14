package hello.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello-springs")
    public String hello() {
        System.out.println("hello Spring");
        return "Hello Spring";
    }
}
