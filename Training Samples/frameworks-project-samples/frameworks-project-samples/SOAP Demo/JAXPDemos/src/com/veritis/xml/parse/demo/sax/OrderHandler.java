package com.veritis.xml.parse.demo.sax;

import java.text.NumberFormat;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * OrderHandler extends DefaultHandler to calculate price, number of items, and
 * number of orders.
 */
public class OrderHandler extends DefaultHandler {
	
	private float fOrderPrice = 0;
	private boolean priceElement = false;
	private final String PRICE = "PRICE";
	private final String ORDER = "Order";
	private final String ORDERS = "Orders";
	private final String ITEM = "Item";
	private int numberOrders = 0;
	private int numberItems = 0;


	public String getOrderPrice() {
		return NumberFormat.getCurrencyInstance().format(fOrderPrice);
	}

	public int getNumberOrders() {
		return numberOrders;
	}

	public void startElement(String namespaceURI, String tagName, String qName, Attributes atts) throws SAXException {
		
		if (PRICE.equals(tagName)) {
			priceElement = true;
		}
		if (ITEM.equals(tagName)) {
			numberItems++;
		}
		if (ORDER.equals(tagName)) {
			// Reset Order's values
			fOrderPrice = 0;
			numberItems = 0;
			numberOrders++;
		}
	}

	public void characters(char[] ch, int start, int length) throws SAXException {
		float floatValue = 0;
		if (priceElement) {
			String strValue = new String(ch, start, length);
			try {
				floatValue = NumberFormat.getCurrencyInstance().parse(strValue).floatValue();
			} catch (java.text.ParseException e) {
				System.out.println("Can't parse the PRICE element - " + e);
			}
			fOrderPrice += floatValue;
		}
	}

	public void endElement(String namespaceURI, String tagName, String qName) throws SAXException {
		if (ORDER.equals(tagName)) {
			System.out
					.println("Order number: " + numberOrders + " Items: " + numberItems + " Total: " + getOrderPrice());
		}
		if (PRICE.equals(tagName)) {
			priceElement = false;
		}
		if (ORDERS.equals(tagName)) {
			System.out.println("Orders found in XML file: " + numberOrders);
		}
	}

}
