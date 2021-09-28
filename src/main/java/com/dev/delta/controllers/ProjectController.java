package com.dev.delta.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.Project;
import com.dev.delta.entities.Employee;
import com.dev.delta.entities.Family;
import com.dev.delta.services.ProjectService;
import com.dev.delta.services.EmployeeService;
import com.dev.delta.services.FamilyService;

@Controller
public class ProjectController {

	/**
	 * projectService
	 */
	@Autowired
	private ProjectService projectService;

	@Autowired
	private EmployeeService employeeService;

	/**
	 * getProjects
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/projects")
	public String getProjects(Model model) {
		List<Project> projects = projectService.getProjects();
		List<Employee> employees = employeeService.getEmployees();
		model.addAttribute("projects", projects);
		model.addAttribute("employees", employees);

		return "project/projects";
	}

	/**
	 * addProject
	 * 
	 * @param project
	 * @return
	 */
	@PostMapping("/addproject")

	public String addProject(Project project) {
		projectService.save(project);
		return "redirect:/projects";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/project/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Project project = projectService.findById(id).get();
		model.addAttribute("project", project);
		return "editActivities";
	}

	/**
	 * updateProject
	 * 
	 * @param id
	 * @param project
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateproject/{id}")
	public String updateProject(@PathVariable("id") long id, @Validated Project project, BindingResult result,
			Model model) {

		projectService.save(project);
		return "redirect:/projects";
	}

	/**
	 * deleteProject
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteproject/{id}")
	@Transactional
	public String deleteProject(@PathVariable("id") Long id) {
		projectService.delete(id);
		return "redirect:/projects";
	}
}
