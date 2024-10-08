package com.data.mapping.DataMapping.controller;

import com.data.mapping.DataMapping.entities.DepartmentEntities;
import com.data.mapping.DataMapping.services.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/departments")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping("/{departmentId}")
    public DepartmentEntities getDepartmentById(@PathVariable Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @PostMapping
    public DepartmentEntities createNewDepartment(@RequestBody DepartmentEntities entities){
        return departmentService.createNewDepartment(entities);
    }

    @PutMapping(path = "/{departmentId}/manager/{employeeId}")
    public DepartmentEntities asignManagerToDepartment(@PathVariable Long departmentId,@PathVariable Long employeeId){
        return  departmentService.asignManagerToDepartment(departmentId,employeeId);
    }
}
