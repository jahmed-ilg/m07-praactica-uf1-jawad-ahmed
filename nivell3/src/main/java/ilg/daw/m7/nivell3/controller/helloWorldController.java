package ilg.daw.m7.nivell3.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class helloWorldController {
    @GetMapping("/")
    public String helloWorld()
    {
        return "Hello World";
    }
    @GetMapping("/{name}")
    public String helloWorld(@PathVariable String name)
    {
        return "Hello " + name;
    }
}
