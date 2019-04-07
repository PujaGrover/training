package com.veritis.xml.parse.demo.sax;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;


/**
 * Main class for SAX Sample
 */
public class SAXSample {

  /**
   * Main method
   * @param args - String[] arguments
 * @throws SAXException 
 * @throws ParserConfigurationException 
 * @throws IOException 
   */
  public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	  	SAXParserFactory factory=SAXParserFactory.newInstance();
	  	
	  	factory.setNamespaceAware(true);
	      // Specifies that the parser produced by this code will validate documents as they are parsed.
	      factory.setValidating(true);
	      SAXParser parser=factory.newSAXParser();
	  	parser.parse(new File("Order.xml"), new OrderHandler());
	  	
  }
}