package com.journaldev.xml.sax;

import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


import com.journaldev.xml.Noticia;

public class SAXRSS {

 public static void main(String[] args) {

      SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		try {
			SAXParser saxParser = saxParserFactory.newSAXParser();
			UserHandler handler = new UserHandler();
			saxParser.parse(new File("noticias.xml"), handler);
			List<Noticia> notice = handler.getList();
			for (Noticia e : notice){
            /* if(e.getTitle().matches(".*(coronavirus|Brexit).*")) {
				System.out.println(e.toString());
            } */
         System.out.println(e.toString());   
         }
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
   }

}
