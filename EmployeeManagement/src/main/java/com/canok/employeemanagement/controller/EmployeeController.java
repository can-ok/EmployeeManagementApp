package com.canok.employeemanagement.controller;


import com.canok.employeemanagement.dto.EmployeeDto;
import com.canok.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/insert")
    public ResponseEntity<Boolean> insertEmployee(@RequestBody EmployeeDto employeeDto){
        Boolean result=employeeService.createEmployee(employeeDto);
        return ResponseEntity.ok(result);
    }
}
