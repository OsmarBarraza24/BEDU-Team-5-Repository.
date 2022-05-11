package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class RestControllerClass {

    @GetMapping("/getHola")
    public String getHola(){
        return "Hola";
    }

    @PostMapping("/add-interviewer")
    public String addInterviewer(@RequestBody Interviewer interviewer){
        return interviewer.toString();
    }


}
