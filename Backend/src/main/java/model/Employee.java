package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email_id")
	private String emailId;

	public Employee() {
	}

	public Employee(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	// Get the first name of the employee
	public String getFirstName() {
		return firstName;
	}

	// Set the first name of the employee
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Get the last name of the employee
	public String getLastName() {
		return lastName;
	}

	// Set the last name of the employee
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Get the email ID of the employee
	public String getEmailId() {
		return emailId;
	}

	// Set the email ID of the employee
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}