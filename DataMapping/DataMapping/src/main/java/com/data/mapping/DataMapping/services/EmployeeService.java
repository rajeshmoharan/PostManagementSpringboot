package com.data.mapping.DataMapping.services;

import com.data.mapping.DataMapping.entities.EmployeeEntities;
import com.data.mapping.DataMapping.repo.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    public EmployeeEntities createNewEmployee(EmployeeEntities employeeEntities){
        return employeeRepo.save(employeeEntities);
    }

    public EmployeeEntities getEmployeeById(long id){
        return employeeRepo.findById(id).orElse(null);
    }
}
