/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.spring.hibernate;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
/**
 *
 * @author vsaranu
 */
public abstract class AbstractSpringDao extends HibernateDaoSupport{
	
	

	public AbstractSpringDao() {
    }

    protected void saveOrUpdate(Object obj){
        getHibernateTemplate().saveOrUpdate(obj);
    }
    protected void delete(Object obj){
        getHibernateTemplate().delete(obj);
    }
    @SuppressWarnings("unchecked")
	protected Object find(Class clazz,Integer id){
       return getHibernateTemplate().get(clazz, id);
    }
    protected List findAll(Class clazz){
        return getHibernateTemplate().find("from "+clazz.getName());
    }

}
