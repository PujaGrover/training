package com.veritis.query.clients;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.veritis.hibernate.query.api.Product;

public class ProjectionDemo {
public static void main(String[] args) {
        
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
        
        // Build a criteria with Projections.property() method
        {
            System.out.println("\n---Using critieria with Projection.property() method...");
            Criteria crit = session.createCriteria(Product.class);
            ProjectionList projList = Projections.projectionList();
            projList.add(Projections.property("name"));
            projList.add(Projections.property("price"));
            crit.setProjection(projList);
            List results = crit.list();
            displayObjectsList(results);
            
        }
        
        // Build a criteria with Projection.avg() method
        {
            System.out.println("\n---Using critieria with Projection.avg() method...");
            Criteria crit = session.createCriteria(Product.class);
            ProjectionList projList = Projections.projectionList();
            projList.add(Projections.max("price"));
            projList.add(Projections.min("price"));
            projList.add(Projections.avg("price"));
            projList.add(Projections.countDistinct("price"));
            projList.add(Projections.rowCount());
            projList.add(Projections.sum("price"));
            crit.setProjection(projList);
            List results = crit.list();
            displayObjectsList(results);
        }
        
        // Build a criteria with Projections.rowCount() method
        {
            System.out.println("\n---Using critieria with Projection.rowCount() method...");
            Criteria crit = session.createCriteria(Product.class);
            crit.setProjection(Projections.rowCount());
            List results = crit.list();
            displayObjectList(results);
        }
        
        // Display tables
//        HibernateUtil.checkData("select * from Supplier");
//        HibernateUtil.checkData("select * from Product");
//        
    }
    
    // Below are utility methods
    
    static public void displayObjectsList(List list) {
        Iterator iter = list.iterator();
        if (!iter.hasNext()) {
            System.out.println("No objects to display.");
            return;
        }
         System.out.println("-------------------------");
        while (iter.hasNext()) {
           
            Object[] obj = (Object[]) iter.next();
            for (int i=0;i<obj.length;i++) {
                System.out.print(obj[i]+"\t");
            }
            System.out.println("");
        }
          System.out.println("-------------------------");
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
    
    static public void displayObjectList(List list) {
        Iterator iter = list.iterator();
        if (!iter.hasNext()) {
            System.out.println("No objects to display.");
            return;
        }
        while (iter.hasNext()) {
            Object obj = iter.next();
            
            System.out.println(obj);
        }
    }
}
