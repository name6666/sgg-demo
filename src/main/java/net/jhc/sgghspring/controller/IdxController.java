package net.jhc.sgghspring.controller;

import net.jhc.sgghspring.pojo.Employee;
import net.jhc.sgghspring.sevice.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IdxController {
    @Autowired
    EmployeeService employeeService;
    @ResponseBody
    @GetMapping("/fd/{user_id}")
    public Employee find(@PathVariable("user_id")Integer user_id){
        return employeeService.findone(user_id);
    }
}
