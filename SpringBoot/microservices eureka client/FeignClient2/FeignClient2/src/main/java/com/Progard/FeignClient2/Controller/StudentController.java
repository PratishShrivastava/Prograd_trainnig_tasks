package com.Progard.FeignClient2.Controller;

import com.Progard.FeignClient2.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app2")
@RestController
public class StudentController {
    @PostMapping("/student/save")
    public Student save(Student student)
    {
        student.setFirstName("Pratish");
        student.setLastName("Shrivastava");
        return student;
    }

}
