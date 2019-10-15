package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

		// define fields
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="first_name")
		private String fisrtName;
		
		@Column(name="last_name")
		private String lastname;
		
		@Column(name="email")
		private String email;
		
		
		
		// define constructors
		public Employee() {
			
		}	
		
		public Employee(String fisrtName, String lastname, String email) {
			this.fisrtName = fisrtName;
			this.lastname = lastname;
			this.email = email;
		}

		
	
	    // define getter/setter	
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFisrtName() {
			return fisrtName;
		}

		public void setFisrtName(String fisrtName) {
			this.fisrtName = fisrtName;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		
	
	    // define tostring
		@Override
		public String toString() {
			return "Employee [id=" + id + ", fisrtName=" + fisrtName + ", lastname=" + lastname + ", email=" + email
					+ "]";
		}
}
