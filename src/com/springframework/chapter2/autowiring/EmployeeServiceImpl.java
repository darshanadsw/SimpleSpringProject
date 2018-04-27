package com.springframework.chapter2.autowiring;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	private String message;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	@Override
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
}
