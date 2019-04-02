package com.codeclan.example.employmentTracker.controllers;

import com.codeclan.example.employmentTracker.models.Project;
import com.codeclan.example.employmentTracker.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping(value = "/")
    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }

    @GetMapping(value = "{id}")
    public Optional<Project> getProject(@PathVariable Long id){
        return projectRepository.findById(id);
    }
}
