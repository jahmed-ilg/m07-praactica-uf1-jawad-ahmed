package ilg.daw.m7.nivell2.controller;
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
