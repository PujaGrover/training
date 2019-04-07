package com.jaxb.client;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.veritis.jaxb.demo.Items;
import com.veritis.jaxb.demo.Items.Item;
import com.veritis.jaxb.demo.ObjectFactory;
import com.veritis.jaxb.demo.PurchaseOrderType;
import com.veritis.jaxb.demo.USAddress;

public class MarshallDemo {

	/**
	 * @param args
	 * @throws JAXBException 
	 * @throws FileNotFoundException 
	 * @throws DatatypeConfigurationException 
	 */
	public static void main(String[] args) throws JAXBException, FileNotFoundException, DatatypeConfigurationException {
		JAXBContext ctx=JAXBContext.newInstance("com.veritis.jaxb.demo");
		ObjectFactory factory=new ObjectFactory();
		PurchaseOrderType po=factory.createPurchaseOrderType();
		USAddress billto=factory.createUSAddress();
		USAddress shipto=factory.createUSAddress();
		Items items=factory.createItems();
		
		billto.setCity("Plano");
		billto.setCountry("US");
		billto.setName("Venkata Saranu");
		billto.setState("TX");
		billto.setStreet("1800 E Springcreek Pkwy");
		billto.setZip(new BigDecimal("75074"));
		
		
		shipto.setCity("Plano");
		shipto.setCountry("US");
		shipto.setName("Rajitha Saranu");
		shipto.setState("TX");
		shipto.setStreet("1800 E Springcreek Pkwy");
		shipto.setZip(new BigDecimal("75074"));
		
		
		Item item=factory.createItemsItem();
		item.setPartNum("111-CD");
		item.setProductName("CD Box");
		item.setQuantity(65);
		item.setUSPrice(new BigDecimal("26.25"));
		
		
		items.getItem().add(item);
		
		item=factory.createItemsItem();
		item.setPartNum("222-MV");
		item.setProductName("Moviess");
		item.setQuantity(35);
		item.setUSPrice(new BigDecimal("98.25"));
		items.getItem().add(item);
		
		item=factory.createItemsItem();
		item.setPartNum("333-GD");
		item.setProductName("Gold Coin");
		item.setQuantity(1);
		item.setUSPrice(new BigDecimal("1600.25"));
		items.getItem().add(item);
		
		item=factory.createItemsItem();
		item.setPartNum("444-NP");
		item.setProductName("Nail Polish");
		item.setQuantity(2);
		item.setUSPrice(new BigDecimal("26.25"));
		items.getItem().add(item);
		
		po.setBillTo(billto);
		po.setShipTo(shipto);
		po.setItems(items);
		
		Date date=new Date();
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(date);
		XMLGregorianCalendar gdate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		
		po.setOrderDate(gdate);
		JAXBElement<PurchaseOrderType> pot=factory.createPurchaseOrder(po);
		
		 Marshaller m=ctx.createMarshaller();
         m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
         m.marshal(pot, new FileOutputStream("sageit.xml"));
         System.out.println("Your Output will be in uis.xml file ");
		
		
	}

}
