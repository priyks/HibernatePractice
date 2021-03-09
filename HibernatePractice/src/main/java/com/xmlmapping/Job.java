package com.xmlmapping;

public class Job {
	private int id;
	private String designation;
	private float salary;
	private Person person;

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param designation
	 * @param salary
	 */
	public Job(int id, String designation, float salary) {
		super();
		this.id = id;
		this.designation = designation;
		this.salary = salary;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	
	

}
