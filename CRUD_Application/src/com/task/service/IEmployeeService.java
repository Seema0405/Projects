
package com.task.service;

import java.sql.SQLException;

import com.task.bean.Employee_Bean;

public interface IEmployeeService {
    public void insertEmployee(Employee_Bean bean) throws ClassNotFoundException, SQLException;

	public void selectEmployee() throws ClassNotFoundException, SQLException;

	public void deleteEmployee(int did) throws ClassNotFoundException, SQLException;

	public void updateEmployee(int uid, Employee_Bean e) throws ClassNotFoundException, SQLException;
}