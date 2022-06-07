package dao;

import java.sql.Date;

public class Employee {
	private int employeeNumber;
	private String employeeName;
	private String job;
	private int employeeManagerCode;
	private Date employeeHiringDate;
	private double basicSalary;
	private double commission;
	private int departmentNumber;
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getEmployeeManagerCode() {
		return employeeManagerCode;
	}
	public void setEmployeeManagerCode(int employeeManagerCode) {
		this.employeeManagerCode = employeeManagerCode;
	}
	public Date getEmployeeHiringDate() {
		return employeeHiringDate;
	}
	public void setEmployeeHiringDate(Date employeeHiringDate) {
		this.employeeHiringDate = employeeHiringDate;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	
	
	
}
