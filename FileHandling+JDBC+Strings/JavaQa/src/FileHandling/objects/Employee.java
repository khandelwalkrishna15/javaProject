package FileHandling.objects;

import java.io.Serializable;

public class Employee implements Serializable {
	
		
	private int employeeId;
	private String name;
	private String designation;
	private String country;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", designation=" + designation + ", country="
				+ country + "]";
	}
	public Employee(int employeeId, String name, String designation, String country) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.country = country;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
