package com.data.mapping.DataMapping.controller;

import com.data.mapping.DataMapping.entities.EmployeeEntities;
import com.data.mapping.DataMapping.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/employees")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/{employeeId}")
    public EmployeeEntities getEmployeeById(@PathVariable Long employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping
    public EmployeeEntities createNewEmployee(@RequestBody EmployeeEntities employeeEntities){
        return employeeService.createNewEmployee(employeeEntities);
    }
}
