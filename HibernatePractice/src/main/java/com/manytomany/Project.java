package com.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int pid;
	
	@Column(name="project_name")
	private String name;
	

	@ManyToMany(mappedBy="projectList")
	private List<Employee> empList;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param pid
	 * @param name
	 * @param empList
	 */
	public Project(int pid, String name, List<Employee> empList) {
		super();
		this.pid = pid;
		this.name = name;
		this.empList = empList;
	}
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
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
	 * @return the empList
	 */
	public List<Employee> getEmpList() {
		return empList;
	}
	/**
	 * @param empList the empList to set
	 */
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", name=" + name + ", empList=" + empList + "]";
	}
	
	
	

}
