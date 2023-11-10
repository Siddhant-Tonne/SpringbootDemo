package com.example.springjpa.demo.repository;

import com.example.springjpa.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    public Department findByDepartmentName(String name);

    public Department findByDepartmentNameIgnoreCase(String name);
}
