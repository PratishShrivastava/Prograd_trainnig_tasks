package com.Progard.FeignClient.Controller;

import com.Progard.FeignClient.Service.RestClientService;
import com.Progard.FeignClient.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app1")
@RestController
public class StudentController {

    @Autowired
    RestClientService restClientService;

    @GetMapping("/student/send")
    public Student save()
    {
        Student student=new Student();
        student.setFirstName("Pratish");
        student.setLastName("Shrivastava");
        return restClientService.save(student);
    }

}
