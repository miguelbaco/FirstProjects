package com.journaldev.xml.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.journaldev.xml.Noticia;

class UserHandler extends DefaultHandler {
   boolean btitulo = false;
   boolean bdescription = false;
   boolean bitem = false;
   Noticia noticia = new Noticia();
   private List<Noticia> notlist = new ArrayList<Noticia>();


   @Override
   public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

   	  if (qName.equalsIgnoreCase("item")) {
   	  						bitem = true;
   	  }

      if ((qName.equalsIgnoreCase("title")) && (bitem)) {

                            btitulo = true;            
   		}
   	  if ((qName.equalsIgnoreCase("description")) && (bitem)) {
   	  						bdescription = true;
   	  }
   	}

   @Override
   public void endElement(String uri, String localName, String qName) throws SAXException {
      if (qName.equalsIgnoreCase("title")) {
      	notlist.add(noticia);
      }
      }

      @Override
      public void characters(char ch[], int start, int length) throws SAXException {
         if (bitem) {

         if (btitulo) {

         noticia.setTitle(new String(ch, start, length));
         btitulo = false;
         }

      	if(bdescription) {
      		noticia.setDescription(new String(ch, start, length));
      		bdescription = false;      		
      	}
      }
   }

   public List<Noticia> getList() {
   		return notlist;
   }
}