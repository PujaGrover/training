package com.veritis.query.clients;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.veritis.hibernate.query.api.Product;
import com.veritis.hibernate.query.api.Supplier;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Product iphone=new Product();
		iphone.setName("Iphone 7");
		iphone.setDescription("Iphone is a smart phone from Apple");
		iphone.setPrice(900.00);
		
		Product ipad=new Product();
		ipad.setName("Ipad Air");
		ipad.setDescription("Ipad is a table from Apple");
		ipad.setPrice(450.00);
		
		
		Product galaxy=new Product();
		galaxy.setName("Galaxy S8");
		galaxy.setDescription("Galaxy S8 is a smart phone from Samsung");
		galaxy.setPrice(650.00);
		
		
		Product galaxyt=new Product();
		galaxyt.setName("Galaxy Tablet 10");
		galaxyt.setDescription("Galaxy Table is a tablet from Samsung");
		galaxyt.setPrice(250.00);
		
		Product sonyTv=new Product();
		sonyTv.setName("Sony 3D");
		sonyTv.setDescription("Sony 3D is a smart TV  from Sony");
		sonyTv.setPrice(1300.00);
		
		Product vaio=new Product();
		vaio.setName("Sony VAIO");
		vaio.setDescription("Sony VAIO is a laptop   from Sony");
		vaio.setPrice(650.00);

		
	
		
		Supplier apple=new Supplier();
		apple.setName("Apple");
		apple.getProducts().add(iphone);
		apple.getProducts().add(ipad);
	
		Supplier samsung=new Supplier();
		samsung.setName("Samsung");
		samsung.getProducts().add(galaxy);
		samsung.getProducts().add(galaxyt);
		
		Supplier sony=new Supplier();
		sony.setName("Sony");
		sony.getProducts().add(sonyTv);
		sony.getProducts().add(vaio);
		
		ipad.setSupplier(apple);
		iphone.setSupplier(apple);
		galaxy.setSupplier(samsung);
		galaxyt.setSupplier(samsung);
		sonyTv.setSupplier(sony);
		vaio.setSupplier(sony);
		
		session.getTransaction().begin();
		session.save(apple);
		session.save(samsung);
		session.save(sony);
		session.save(ipad);
		session.save(iphone);
		session.save(galaxy);
		session.save(galaxyt);
		session.save(sonyTv);
		session.save(vaio);
		
		session.getTransaction().commit();
		
		

	}

}
