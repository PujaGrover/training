package com.veritis.spring.jdbc.demo;

import com.veritis.spring.jdbc.demo.domain.Emp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


//@Repository(value="empDAO")
public class JDBCEmpDAOImpl implements EmpDAO {

	private DataSource dataSource;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insertemp(Emp emp) {
		
		String query = "INSERT INTO emp (empno, ename, job, sal) VALUES (?,?,?,?)";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, emp.getEmpno());
			preparedStatement.setString(2, emp.getEname());
			preparedStatement.setString(3, emp.getJob());
            preparedStatement.setDouble(4, emp.getSal());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
	public Emp selectemp(int empId) {
		
		String query = "SELECT * FROM emp WHERE empno=?";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, empId);
			
			resultSet = preparedStatement.executeQuery();
			Emp emp = null;
			
			if(resultSet.next())
			{
				emp = new Emp(resultSet.getInt("empno"),resultSet.getString("ename"),resultSet.getString("job"),resultSet.getDouble("sal"));
			}
			return emp;
		} catch (SQLException e) {
		
			e.printStackTrace();
		} finally {
			try {
				
				if (resultSet != null) {
					resultSet.close();
				}
				
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return null;
	}

    public List<Emp> selectemps(double sal) {
    	String query = "SELECT * FROM emp WHERE sal >= ?";
		Connection connection = null;
		List<Emp> emps=new ArrayList<Emp>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setDouble(1, sal);
			resultSet = preparedStatement.executeQuery();
			Emp emp = null;
			
			while(resultSet.next())
			{
				emp = new Emp(resultSet.getInt("empno"),resultSet.getString("ename"),resultSet.getString("job"),resultSet.getDouble("sal"));
				emps.add(emp);
			}
			return emps;
		} catch (SQLException e) {
		
			e.printStackTrace();
		} finally {
			try {
				
				if (resultSet != null) {
					resultSet.close();
				}
				
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
    	
        return null;
        
    }

}
