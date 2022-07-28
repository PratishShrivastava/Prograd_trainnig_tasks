package com.Prograd.PrintPratish.PrintNameController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintNameController {
    @GetMapping("/Name")
    public String Name(){
        return "<h1>Hi, My Name is Pratish Shrivastava.</h1>";
    }
}
