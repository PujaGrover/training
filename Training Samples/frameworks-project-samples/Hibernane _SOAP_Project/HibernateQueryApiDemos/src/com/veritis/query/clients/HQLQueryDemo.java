package com.veritis.query.clients;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.veritis.hibernate.query.api.Product;
import com.veritis.hibernate.query.api.Supplier;

public class HQLQueryDemo {
 public static void main(String[] args) {
	 SessionFactory factory=new Configuration().configure().buildSessionFactory();
   	Session session=factory.openSession();
       
       // Perform HQL query with paging
       {
           System.out.println("\n---Performing HQL query with paging...");
           Query query = session.createQuery("from Product");
           
           // Set paging requirement
           query.setFirstResult(1);
           query.setMaxResults(2);
           
           List results = query.list();
           displayProductsList(results);
           
       }
       
       // Perform HQL query with like like
       {
           System.out.println("\n---Performing HQL query like...");
           String hql = "from Product where price > 2.0 and name like 'G%'";
           Query query = session.createQuery(hql);
           List results = query.list();
           displayProductsList(results);
       }
       
       // Build a criteria with join
       {
           System.out.println("\n---Performing HQL query with join... ");
           String hql = "from Supplier s join fetch s.products as p";
           Query query = session.createQuery(hql);
           List results = query.list();
           displaySupplierList(results);
       }
       
//       // Display tables
//       HibernateUtil.checkData("select * from Supplier");
//       HibernateUtil.checkData("select * from Product");
       
   }
   
   // Below are utility methods
   
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
   
   static public void displayObjectList(List list) {
       Iterator iter = list.iterator();
       if (!iter.hasNext()) {
           System.out.println("No objects to display.");
           return;
       }
       while (iter.hasNext()) {
           System.out.println("New object");
           Object obj = (Object) iter.next();
           System.out.println(obj);
           
           
       }
   }
}
