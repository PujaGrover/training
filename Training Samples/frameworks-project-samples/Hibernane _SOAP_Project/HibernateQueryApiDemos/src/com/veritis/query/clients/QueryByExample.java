package com.veritis.query.clients;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import com.veritis.hibernate.query.api.Product;
import com.veritis.hibernate.query.api.Supplier;

public class QueryByExample {

	   public static void main(String[] args) {
	        
		   SessionFactory factory=new Configuration().configure().buildSessionFactory();
			Session session=factory.openSession();
	        
	        // Build a criteria with Query By Example
	        {
	            System.out.println("\n---Using criteria with Query By Example...");
	            Criteria crit = session.createCriteria(Supplier.class);
	            Supplier supplier = new Supplier();
	            supplier.setName("S%");
	           
	            crit.add(Example.create(supplier).enableLike());
	            List results = crit.list();
	            
	            displaySupplierList(results);
	        }
	        
	        // Build a criteria with Query By Example 2
	        {
	            System.out.println("\n---Using criteria with Query By Example 2...");
	            Criteria prdCrit = session.createCriteria(Product.class);
	            Product product = new Product();
	            product.setName("I%");
	            Example prdExample = Example.create(product);
	            prdExample.excludeProperty("price");
	            prdExample.enableLike();
	            Criteria suppCrit = prdCrit.createCriteria("supplier");
	            Supplier supplier = new Supplier();
	            supplier.setName("Apple");
	            suppCrit.add(Example.create(supplier));
	            prdCrit.add(prdExample);
	            prdCrit.add(Restrictions.gt("price",450.00));

	            List results = prdCrit.list();
	            
	            displayProductsList(results);
	        }
	        
	        // Display tables
//	        HibernateUtil.checkData("select * from Supplier");
//	        HibernateUtil.checkData("select * from Product");
//	        
	    }
	    
	    // Below are the utility methods
	    
	    static public void displayObjectsList(List list) {
	        Iterator iter = list.iterator();
	        if (!iter.hasNext()) {
	            System.out.println("No objects to display.");
	            return;
	        }
	        while (iter.hasNext()) {
	            System.out.println("New object");
	            Object[] obj = (Object[]) iter.next();
	            for (int i=0;i<obj.length;i++) {
	                System.out.println(obj[i]);
	            }
	            
	            
	        }
	    }
	    
	    static public void displaySupplierList(List list) {
	        Iterator iter = list.iterator();
	        if (!iter.hasNext()) {
	            System.out.println("No suppliers to display.");
	            return;
	        }
	        while (iter.hasNext()) {
	            Supplier supplier = (Supplier) iter.next();
	            String msg = supplier.getId()+" "+supplier.getName();
	            System.out.println(msg);
	        }
	    }
	    
	    public static void displayProductsList(List list){
	        Iterator iter = list.iterator();
	        if (!iter.hasNext()){
	            System.out.println("No products to display.");
	            return;
	        }
	        while (iter.hasNext()){
	            Product product = (Product) iter.next();
	            String msg = product.getSupplier().getName() + "\t";
	            msg += product.getName() + "\t";
	            msg += product.getPrice() + "\t";
	            msg += product.getDescription();
	            System.out.println(msg);
	        }
	    }
}
