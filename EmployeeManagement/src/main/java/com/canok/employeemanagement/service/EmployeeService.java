package com.canok.employeemanagement.service;


import com.canok.employeemanagement.dto.EmployeeDto;
import com.canok.employeemanagement.entity.CompanyEntity;
import com.canok.employeemanagement.entity.EmployeeEntity;
import com.canok.employeemanagement.repository.CompanyRepository;
import com.canok.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    CompanyRepository companyRepository;

    public Boolean createEmployee(EmployeeDto dto){
        Optional<CompanyEntity> optionalCompanyEntity =companyRepository.findById(dto.getCompanyId());
        if(optionalCompanyEntity.isPresent()){
            EmployeeEntity entity= new EmployeeEntity();
            entity.setCompanyEntity(optionalCompanyEntity.get());
            entity.setName(dto.getName());
            entity.setGender(dto.getGender());
            EmployeeEntity optionalEmployeeEntity=employeeRepository.save(entity);
            if (optionalEmployeeEntity.getId()!=null){
                return true;
            }
        }
        return false;
    }
}
