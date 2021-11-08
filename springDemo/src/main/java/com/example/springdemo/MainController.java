package com.example.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //enables request handling
public class MainController {

    private List<Puppy> puppies = new ArrayList<>();

    @GetMapping("/") // listen a request at /hello
    public String main(){
        return "Hello, World in the main!";
    }

    @GetMapping("/hello") // listen a request at /hello
    public String hello(){
        Puppy p1 = new Puppy("Rex","G Shepperd", 44);
        return "Hello, World! "+ p1.getName();
    }

    @PostMapping("/create")
    public Puppy createPuppy(@RequestBody Puppy newPuppy){
        this.puppies.add(newPuppy);
        
    }

}
