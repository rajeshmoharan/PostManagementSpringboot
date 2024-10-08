package com.data.mapping.DataMapping.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "employees")
@ToString
public class EmployeeEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    //two way mapping
    @OneToOne(mappedBy = "manager")
    @JsonIgnore
    private DepartmentEntities managedByDepartment;

    @ManyToOne
    @JoinColumn(name = "worker_department_id",referencedColumnName = "id")
    private DepartmentEntities workerDepartment;
}
