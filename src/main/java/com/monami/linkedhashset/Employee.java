package com.monami.linkedhashset;

	public class Employee {
		private int id;
		private String name;
		public Employee(int empId, String name) {
		this.id = empId;
		this.name = name;
		}
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
		public String toString() {
		return "Id = " + getId() + " Name = " + getName();
		}
		public int hashCode() {
		return getId();
		}
		public boolean equals(Object object) {
		boolean status = false;
		Employee employee = (Employee) object;
		if (getId() == employee.getId()) {
		status = true;
		} else {
		status = false;
		}
		return status;
		}

}
