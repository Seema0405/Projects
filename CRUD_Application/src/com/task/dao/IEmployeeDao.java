package com.task.dao;

import java.sql.SQLException;

import com.task.bean.Employee_Bean;

public interface IEmployeeDao {

	void insertEmployee(Employee_Bean e) throws ClassNotFoundException, SQLException;

	void updateEmployee(int uid, Employee_Bean e) throws ClassNotFoundException, SQLException;;

	void selectEmployee() throws ClassNotFoundException, SQLException;

	void deleteEmployee(int did) throws ClassNotFoundException, SQLException;

}
