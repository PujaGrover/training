package com.jaxb.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.veritis.jaxb.demo.PurchaseOrderType;
import com.veritis.jaxb.demo.USAddress;

public class UnMarshallingDemo {

	/**
	 * @param args
	 * @throws JAXBException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		JAXBContext ctx=JAXBContext.newInstance("com.veritis.jaxb.demo");
		Unmarshaller um=ctx.createUnmarshaller();
		JAXBElement<PurchaseOrderType> pot=(JAXBElement<PurchaseOrderType>) um.unmarshal(new FileInputStream("po.xml"));
		
		PurchaseOrderType po=pot.getValue();
		USAddress billto=po.getBillTo();
		s("Name : "+billto.getName());
		s("Street :"+billto.getStreet());
		s("Zip code: "+billto.getZip());
		
		USAddress shipto=po.getShipTo();
		s("Name : "+shipto.getName());
		s("Street :"+shipto.getStreet());
		s("Zip code: "+shipto.getZip());

	}
	public static void s(Object s){
		System.out.println(s);
	}
}
