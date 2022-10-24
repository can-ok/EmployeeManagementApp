package com.canok.employeemanagement.service;

import com.canok.employeemanagement.entity.CompanyEntity;
import com.canok.employeemanagement.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    public Boolean createCompany(CompanyEntity companyEntity){
        CompanyEntity savedEntity=companyRepository.save(companyEntity);
        if(savedEntity!=null){
            return true;
        }
        return false;
    }
}
