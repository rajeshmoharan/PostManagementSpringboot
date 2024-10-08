package com.data.mapping.DataMapping.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Entity
@Table(name = "departments")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DepartmentEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @OneToOne
    @JoinColumn(name = "department_manager")
    private EmployeeEntities manager;

    @OneToMany(mappedBy = "workerDepartment")
    private Set<EmployeeEntities> workers;

}
