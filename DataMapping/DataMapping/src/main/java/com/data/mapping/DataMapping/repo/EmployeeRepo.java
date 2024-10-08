package com.data.mapping.DataMapping.repo;

import com.data.mapping.DataMapping.entities.EmployeeEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntities,Long> {
}
