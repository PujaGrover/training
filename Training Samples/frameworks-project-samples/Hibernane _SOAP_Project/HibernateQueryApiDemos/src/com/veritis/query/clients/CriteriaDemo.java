package com.veritis.query.clients;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.veritis.hibernate.query.api.Product;
import com.veritis.hibernate.query.api.Supplier;

public class CriteriaDemo {
	@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
			Session session=factory.openSession();
	    
        // Build a simple criteria with no restriction
        {
            System.out.println("\n---Using criteria with no restriction...");
            Criteria crit = session.createCriteria(Product.class);
            List results = crit.list();
            displayProductsList(results);
        }
        // Build a simple criteria with paging
        {
            System.out.println("\n---Using criteria with paging...");
            Criteria crit = session.createCriteria(Product.class);
            crit.setFirstResult(0);   // Starting row
            crit.setMaxResults(2);    // Size of each page
            List results = crit.list();
            displayProductsList(results);
           System.out.println("Remaining Products are ");
            crit.setFirstResult(2);
            crit.setMaxResults(4);
            results=crit.list();
            displayProductsList(results);
        }
        
        // Build a criteria with two conditions
        {
            System.out.println("\n---Using criteria with two Restrictions...");
            Criteria crit = session.createCriteria(Product.class);
            crit.add(Restrictions.gt("price",new Double(450.0)));
            crit.add(Restrictions.like("name","I%"));
            
            List results = crit.list();
            displayProductsList(results);
        }
        
        // Build a criteria with a Restriction.like
        {
            System.out.println("\n---Using criteria with Restriction.ilike...");
            Criteria crit = session.createCriteria(Product.class);
            crit.add(Restrictions.ilike("name","gal%"));
            
            List results = crit.list();
            displayProductsList(results);
        }
        
        // Build a criteria with Restrictions.or
        {
            System.out.println("\n---Using criteria with Restrictions.or... ");
            Criteria crit = session.createCriteria(Product.class);
            Criterion price = Restrictions.gt("price",new Double(30.0));
            Criterion name = Restrictions.like("name","I%");
            LogicalExpression orExp = Restrictions.or(price,name);
            crit.add(orExp);
            
            List results = crit.list();
            displayProductsList(results);
        }
        
        // Build a criteria with Criteria.DISTINCT_ROOT_ENTITY
        {
            System.out.println("\n---Using criteria with Criteria.DISTINCT_ROOT_ENTITY... ");
            Criteria crit = session.createCriteria(Product.class);
            crit.add(Restrictions.gt("price",new Double(550.0)));
            //crit.add(Restrictions.like("supplierId","P%"));
            crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            
            List results = crit.list();
            displayProductsList(results);
        }
        
        // Build a criteria with Order
        {
            System.out.println("\n---Using criteria with Order... ");
            Criteria crit = session.createCriteria(Product.class);
            crit.add(Restrictions.gt("price",new Double(1.0)));
            crit.addOrder(Order.desc("price"));
            
            List results = crit.list();
            displayProductsList(results);
            
        }
        
        // Build a criteria with Association and Order
        {
            System.out.println("\n---Using criteria with Association and Order... ");
            Criteria crit = session.createCriteria(Supplier.class);
            crit.addOrder(Order.desc("name"));
            Criteria prdCrit = crit.createCriteria("products");
            prdCrit.add(Restrictions.gt("price",new Double(250.0)));
            
            List results = prdCrit.list();
            displaySupplierList(results);
            
        }
        
        // Build a criteria with Unique Result
        {
            try{
                System.out.println("\n---Using criteria with Unique Result... ");
                Criteria crit = session.createCriteria(Product.class);
                Criterion price = Restrictions.gt("price",new Double(950.0));
                crit.add(price);
                Product product = (Product) crit.uniqueResult();
                
                List results = new ArrayList();
                results.add(product);
                displayProductsList(results);
            } catch(org.hibernate.NonUniqueResultException e){
                System.out.println("org.hibernate.NonUniqueResultException received");
            }
        }
        
        // Display tables
        
    }
    
    // Below are utility methods
    
    @SuppressWarnings("rawtypes")
	public static void displayProductsList(List list){
        Iterator iter = list.iterator();
        if (!iter.hasNext()){
            System.out.println("No products to display.");
            return;
        }
        while (iter.hasNext()){
            Product product = (Product) iter.next();
            String msg = product.getSupplier().getName() + "\t";
            msg += product.getId()+"\t";
            msg += product.getName() + "\t\t";
            msg += product.getPrice() + "\t";
            msg += product.getDescription();
            System.out.println(msg);
        }
    }
    
    @SuppressWarnings("rawtypes")
	static public void displaySupplierList(List list) {
        Iterator iter = list.iterator();
        if (!iter.hasNext()) {
            System.out.println("No suppliers to display.");
            return;
        }
        while (iter.hasNext()) {
            Supplier supplier = (Supplier) iter.next();
            String msg = supplier.getName();
            msg += supplier.getId();
            System.out.println(msg);
        }
    }
}
