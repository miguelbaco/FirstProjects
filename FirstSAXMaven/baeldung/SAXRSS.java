import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class SAXRSS {

 public static void main(String[] args) {

      try {
         File inputFile = new File("rssej.txt");
         SAXParserFactory factory = SAXParserFactory.newInstance();
         SAXParser saxParser = factory.newSAXParser();
         UserHandler userhandler = new UserHandler();
         saxParser.parse(inputFile, userhandler);     
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

}

class UserHandler extends DefaultHandler {
   boolean btitulo = false;
   boolean bdescription = false;
   boolean bitem = false;

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
         System.out.println("");
      }
      }

      @Override
      public void characters(char ch[], int start, int length) throws SAXException {
         if (bitem) {

         if (btitulo) {
         	
         System.out.print("Titulo: " + new String(ch, start, length));
         btitulo = false;
         }

      	if(bdescription) {
      		System.out.print("Description: " + new String(ch, start, length));
      		bdescription = false;
      		
      	}
      }
   }
}

