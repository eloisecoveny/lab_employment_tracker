package com.codeclan.example.employmentTracker.repositories;

import com.codeclan.example.employmentTracker.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
