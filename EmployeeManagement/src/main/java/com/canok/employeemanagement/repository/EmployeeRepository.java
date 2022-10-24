package com.canok.employeemanagement.repository;

import com.canok.employeemanagement.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
