package com.progard.Ajaxrestapi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class AjaxController {
    @GetMapping("/call")
    public String call(){
        return "Call form call() hi";
    }
}
