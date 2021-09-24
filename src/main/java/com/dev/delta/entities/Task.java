package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String subject;
	@ManyToOne
	@JoinColumn(name="project_id")
	Project project;
	@ManyToOne
	@JoinColumn(name="employee_id")
	Employee assigned;
	String priority;
	String date;
    String deadline;
	String tags;
	
	public Task() {
		// TODO Auto-generated constructor stub
	}

	public Task(String subject, Project project, Employee assigned, String priority, String date, String deadline,
			String tags) {
		super();
		this.subject = subject;
		this.project = project;
		this.assigned = assigned;
		this.priority = priority;
		this.date = date;
		this.deadline = deadline;
		this.tags = tags;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Employee getAssigned() {
		return assigned;
	}

	public void setAssigned(Employee assigned) {
		this.assigned = assigned;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	
	
}
