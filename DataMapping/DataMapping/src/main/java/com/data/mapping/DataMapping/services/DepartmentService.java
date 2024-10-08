package com.data.mapping.DataMapping.services;

import com.data.mapping.DataMapping.entities.DepartmentEntities;
import com.data.mapping.DataMapping.entities.EmployeeEntities;
import com.data.mapping.DataMapping.repo.DepartmentRepo;
import com.data.mapping.DataMapping.repo.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentRepo departmentRepo;
    private final EmployeeRepo employeeRepo;

    public DepartmentEntities createNewDepartment(DepartmentEntities departmentEntities) {
        return departmentRepo.save(departmentEntities);
    }

    public DepartmentEntities getDepartmentById(Long id){
        return departmentRepo.findById(id).orElse(null);
    }

    public DepartmentEntities asignManagerToDepartment(Long departmentId, Long employeeId) {
        Optional<DepartmentEntities> departmentEntities = departmentRepo.findById(departmentId);
        Optional<EmployeeEntities> employeeEntities = employeeRepo.findById(employeeId);

        return  departmentEntities.flatMap(departmentEntities1 ->
                employeeEntities.map(employee -> {
                    departmentEntities1.setManager(employee);
                    return departmentRepo.save(departmentEntities1);
                })).orElse(null);
    }
}
