package com.canok.employeemanagement.controller;


import com.canok.employeemanagement.entity.CompanyEntity;
import com.canok.employeemanagement.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @PostMapping("/insert")
    public ResponseEntity<Boolean> insertCompany(@RequestBody CompanyEntity companyEntity){

        return ResponseEntity.ok(companyService.createCompany(companyEntity));
    }
}
