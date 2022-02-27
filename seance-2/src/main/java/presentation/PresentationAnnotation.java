package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import metier.IMetier;

public class PresentationAnnotation {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext( "dao","metier","daoV2"); 
		IMetier metier = (IMetier) context.getBean("metier");
		System.out.println(metier.calcul());
		
	}

}
