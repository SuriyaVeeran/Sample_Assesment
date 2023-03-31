package com.example.web;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_data")
public class Employee_Record {
 
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column()
	private String name;

	@Column
	private String dateOfBirth;

	@Column
	private String status;

	@Column
	private String dateOfJoining;

	@Column
	private int daysOnLeave;

	@Column
	private float salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getDaysOnLeave() {
		return daysOnLeave;
	}

	public void setDaysOnLeave(int daysOnLeave) {
		this.daysOnLeave = daysOnLeave;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
