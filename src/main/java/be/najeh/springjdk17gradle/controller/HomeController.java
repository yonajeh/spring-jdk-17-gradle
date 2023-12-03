package be.najeh.springjdk17gradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String base(){
        return "SalamoAlikom v2";
    }

    @GetMapping("/home")
    public String home(){
        return "SalamoAlikom in home";
    }

}
