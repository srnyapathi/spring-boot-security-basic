package in.srnyapathi.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/hello-world")
public class HelloController {
    @GetMapping
    public Mono<String> sayHelloWorld() {
        return Mono.just("Hello World !!! Yay !");
    }
}
