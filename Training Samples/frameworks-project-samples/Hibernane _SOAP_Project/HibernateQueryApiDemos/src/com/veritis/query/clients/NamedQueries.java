package com.veritis.query.clients;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.veritis.hibernate.query.api.Product;
import com.veritis.hibernate.query.api.Supplier;

public class NamedQueries {
public static void main(String[] args) {
        

	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
            
        // Perform HQL Query with named query
        {
            System.out.println("\n---Performing HQL query with named query...");
            Query query = session.getNamedQuery("HQLpricing");
            query.setParameter("price",new Double(400));
            List results = query.list();
            displayObjectList(results,"Price");
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
    
    static public void displaySupplierList(List list) {
        Iterator iter = list.iterator();
        if (!iter.hasNext()) {
            System.out.println("No suppliers to display.");
            return;
        }
        while (iter.hasNext()) {
            Supplier supplier = (Supplier) iter.next();
            String msg = supplier.getName();
            System.out.println(msg);
        }
    }
    
    static public void displayObjectList(List list,String name) {
        Iterator iter = list.iterator();
        if (!iter.hasNext()) {
            System.out.println("No objects to display.");
            return;
        }
        System.out.println("List of "+name);
        while (iter.hasNext()) {
           // System.out.println("New object");
            Object obj = (Object) iter.next();
            System.out.println(obj);      
        }
    }
}
