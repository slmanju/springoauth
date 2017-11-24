package com.manjula.springoauth.controller;

import com.manjula.springoauth.service.EmployeeService;
import com.manjula.springoauth.view.EmployeeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping()
    public List<EmployeeView> list() {
        return employeeService.findAll();
    }

    @GetMapping(value = "/{id}")
    public EmployeeView find(@PathVariable String id) {
        return employeeService.findOne(id);
    }

    @PostMapping()
    public String save(@RequestBody EmployeeView employee) {
        employeeService.save(employee);
        return "ok";
    }

    @PutMapping()
    public EmployeeView update(@RequestBody EmployeeView employee) {
        return employeeService.update(employee);
    }

    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable String id) {
        employeeService.delete(id);
        return "ok";
    }

}
