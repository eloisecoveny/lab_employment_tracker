package com.codeclan.example.employmentTracker.repositories;

import com.codeclan.example.employmentTracker.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
