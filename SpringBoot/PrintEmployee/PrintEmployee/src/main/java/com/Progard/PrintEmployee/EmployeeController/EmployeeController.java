package com.Progard.PrintEmployee.EmployeeController;

import com.Progard.PrintEmployee.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
//    @GetMapping("/employee/{fname}/{sname}/{salary}") // http://localhost:8080/employee/pratish/shrivastava/500000
//    public Employee employee_details(
//            @PathVariable("fname")String fname,
//            @PathVariable("sname")String sname,
//            @PathVariable("salary")int salary
//    ){
//        return new Employee(fname, sname, salary);
//    }

    @GetMapping("/employee")//http://localhost:8080/employee?fname=pratish&sname=shrivastava&salary=15000
    public Employee employee_details(
            @RequestParam(name = "fname")String fname,
            @RequestParam(name = "sname")String sname,
            @RequestParam(name = "salary")int salary
    ){
        return new Employee(fname, sname, salary);
    }
}
