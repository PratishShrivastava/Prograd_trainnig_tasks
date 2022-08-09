package com.Quess.MicroService.MicroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BigSmallNumber {
    @Autowired
    private Numberconfigration numberconfigration;
    @GetMapping("/number")
    public Numberconfigration retrieveNum()
    {
        return new Numberconfigration(numberconfigration.getMax(), numberconfigration.getMin());
    }

}
