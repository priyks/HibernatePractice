package com.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int eid;
	
	@Column(name="employee_name")
	private String name;
	
	@ManyToMany
	@JoinTable(name="emp_pro", joinColumns= {@JoinColumn(name="eid")},
	inverseJoinColumns={@JoinColumn(name="pid")})
	private List<Project> projectList;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param eid
	 * @param name
	 * @param projectList
	 */
	public Employee(int eid, String name, List<Project> projectList) {
		super();
		this.eid = eid;
		this.name = name;
		this.projectList = projectList;
	}

	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}

	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the projectList
	 */
	public List<Project> getProjectList() {
		return projectList;
	}

	/**
	 * @param projectList the projectList to set
	 */
	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", projectList=" + projectList + "]";
	}
	
	
	

}
