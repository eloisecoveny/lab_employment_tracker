package com.codeclan.example.employmentTracker.repositories;

import com.codeclan.example.employmentTracker.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
