package com.veritis.spring.jdbc.demo;

import com.veritis.spring.jdbc.demo.domain.Emp;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository(value="empDAO")
public class EmpDAOImpl implements EmpDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void insertemp(Emp emp) {
		
		String query = "INSERT INTO EMP (empno, ename, job, sal) VALUES (?,?,?,?)";
		
		Object inputs[]=new Object[] { emp.getEmpno(),	emp.getEname(), emp.getJob(),emp.getSal() };
		jdbcTemplate.update(query, inputs);
	}
	
	public List<Emp> selectemps(double sal) {
	
		String query = "SELECT * FROM EMP WHERE sal<?";
		Object input[]=new Object[]{sal};
		
                List<Emp> emp=(List<Emp>)jdbcTemplate.query(query,input , new EmpRowmapper());
                return emp;
		
	}

    public Emp selectemp(int empId) {
        String query = "SELECT * FROM EMP WHERE empno=?";
        Emp e=(Emp)jdbcTemplate.queryForObject(query, new Object[]{empId}, new EmpRowmapper());
        return e;
    }

}
