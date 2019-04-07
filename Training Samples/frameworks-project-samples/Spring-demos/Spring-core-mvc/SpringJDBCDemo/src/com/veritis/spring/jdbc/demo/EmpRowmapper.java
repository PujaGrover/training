/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veritis.spring.jdbc.demo;

import com.veritis.spring.jdbc.demo.domain.Emp;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author RajithaVenkat
 */
public class EmpRowmapper implements RowMapper<Emp> {

    public Emp mapRow(ResultSet rs, int i) throws SQLException {
      Emp e =new Emp();
      e.setEmpno(rs.getInt("empno"));
      e.setEname(rs.getString("ename"));
      e.setJob(rs.getString("job"));
      e.setSal(rs.getDouble("sal"));
      return e;
    }
    
}
