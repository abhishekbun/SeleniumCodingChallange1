package xml;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import javax.xml.xpath.*;


public class ProductXPath {

	
	public void display() {
		
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document d = db.parse("src\\main\\java\\xml\\products.xml");
			XPath xp = XPathFactory.newInstance().newXPath();
			NodeList nl = (NodeList)xp.compile("//product").evaluate(d, XPathConstants.NODESET);
			System.out.println("Number of Node List "+ nl.getLength() );
			for(int i=0; i<nl.getLength(); i++) {
				System.out.println("ID: "+xp.compile("./@id").evaluate(nl.item(i)));
				System.out.println("Name: "+xp.compile("./name").evaluate(nl.item(i)));
				System.out.println("Price: "+xp.compile("./price").evaluate(nl.item(i)));
			}
		}
		catch(Exception e) {
			
			
			System.out.println(e.getMessage());
		}
		
	}
}
