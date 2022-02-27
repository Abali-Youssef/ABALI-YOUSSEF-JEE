package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class PresentationXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context  = new ClassPathXmlApplicationContext("ApplicationContexte.xml");
IMetier metier = (IMetier) context.getBean("metier");
System.out.print("resultat est "+metier.calcul());
	}

}
