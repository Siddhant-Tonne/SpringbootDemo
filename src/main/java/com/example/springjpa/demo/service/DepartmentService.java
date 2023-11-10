package com.example.springjpa.demo.service;

import com.example.springjpa.demo.entity.Department;
import com.example.springjpa.demo.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Department department, Long departmentId);

    Department fetchDepartmentByName(String name);
}
