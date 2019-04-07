/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.spring.hibernate;


import java.util.List;

import org.springframework.stereotype.Repository;

/**
 *
 * @author vsaranu
 */

public class EmployeeDAO extends AbstractSpringDao{

    public EmployeeDAO() {
    }

    public Emp find(Integer id){
        return (Emp) super.find(Emp.class, id);
    }

    public void saveOrUpdate(Emp Emp){
        super.saveOrUpdate(Emp);
    }

    public void delete(Emp Emp){
        super.delete(Emp);
    }

    public List findAll(){
        return super.findAll(Emp.class);
    }

}
