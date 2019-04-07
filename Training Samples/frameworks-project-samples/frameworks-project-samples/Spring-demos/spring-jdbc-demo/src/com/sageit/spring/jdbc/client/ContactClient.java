package com.sageit.spring.jdbc.client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.sageit.spring.jdbc.config.ContactConfiguration;
import com.sageit.spring.jdbc.dao.ContactDAO;
import com.sageit.spring.jdbc.domain.Contact;

public class ContactClient {

	public static void main(String[] args) {
		 AbstractApplicationContext context = new AnnotationConfigApplicationContext(ContactConfiguration.class);
		 ContactDAO contactDAO=(ContactDAO)context.getBean("contactDAO");
		 Contact newcontact=new Contact("Saranu", "saranu@gmail.com", "2344 Joseph st ,Lewisville ,TX 75056", "469-602-6918");
		 contactDAO.saveOrUpdate(newcontact);
		 //System.out.println("Contact Created....");
		 List<Contact> contacts=contactDAO.list();
		 for(Contact contact:contacts){
			 System.out.println(contact);
		 }
	}

}
