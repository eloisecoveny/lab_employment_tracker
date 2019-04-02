package com.codeclan.example.employmentTracker;

import com.codeclan.example.employmentTracker.models.Department;
import com.codeclan.example.employmentTracker.models.Employee;
import com.codeclan.example.employmentTracker.models.Project;
import com.codeclan.example.employmentTracker.repositories.DepartmentRepository;
import com.codeclan.example.employmentTracker.repositories.EmployeeRepository;
import com.codeclan.example.employmentTracker.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmploymentTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartmentAndProject(){
		Department department = new Department("Product team");
		departmentRepository.save(department);
		Employee employee = new Employee("Eloise", "Coveny", 1919, "eloisecoveny@gmail.com", department);
		employeeRepository.save(employee);
		department.addEmployee(employee);
		departmentRepository.save(department);
		Project project = new Project("Skittles", 10);
		projectRepository.save(project);
		employee.addProject(project);
		employeeRepository.save(employee);
	}

}
