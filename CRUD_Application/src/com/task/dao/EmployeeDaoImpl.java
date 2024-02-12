package com.task.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.task.bean.Employee_Bean;
import com.task.util.DBUtil;

public class EmployeeDaoImpl implements IEmployeeDao {
	public static PreparedStatement pst=null;
	public static Connection connection=null;
	@Override
	public void insertEmployee(Employee_Bean e) throws ClassNotFoundException, SQLException {

		int id = e.getEmpid();
		String name = e.getEmpname();
		String address = e.getEmpaddress();
		
		connection = DBUtil.getDBConnection();
		pst = connection.prepareStatement("insert into employee values(?, ?, ?)");
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, address);
		pst.executeUpdate();
		
		System.out.println("Data Inserted");
		
		pst.close();
		DBUtil.getDBDestroyConnection();
		
	}
	@Override
	public void updateEmployee(int uid, Employee_Bean e) throws ClassNotFoundException, SQLException {

		int id = e.getEmpid();
		String name = e.getEmpname();
		String address = e.getEmpaddress();
		
		connection = DBUtil.getDBConnection();
		pst = connection.prepareStatement("update employee set empId=?, empName=?, empAddress=? where empId="+uid);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, address);
		pst.executeUpdate();
		
		System.out.println("Data Updated");
		
		pst.close();
		DBUtil.getDBDestroyConnection();
		
	}
	@Override
	public void selectEmployee() throws ClassNotFoundException, SQLException {

		connection = DBUtil.getDBConnection();
		pst = connection.prepareStatement("select * from employee");
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		}
		System.out.println("Data Fetched");
		pst.close();
		DBUtil.getDBDestroyConnection();
		
	}
	@Override
	public void deleteEmployee(int did) throws ClassNotFoundException, SQLException {

		connection = DBUtil.getDBConnection();
		pst = connection.prepareStatement("delete from employee where empId="+did);
		pst.executeUpdate();
		
		System.out.println("Data Deleted");
		pst.close();
		DBUtil.getDBDestroyConnection();
		
	}


	
}
