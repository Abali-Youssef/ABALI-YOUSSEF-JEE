package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;

public class PresentationV2 {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
	
			 Scanner scanner=new Scanner(new File("config.txt"));
			 String daoClassname=scanner.next();
			 String metierClassName=scanner.next();
			 Class cdao=Class.forName(daoClassname);
			 IDao dao= (IDao) cdao.newInstance();
			 Class cmetier=Class.forName (metierClassName);
			 IMetier metier= (IMetier) cmetier.newInstance();
			 Method meth=cmetier.getMethod ("setIdao", IDao.class);
			 meth.invoke(metier,dao);
			 System.out.println(metier.calcul());
			 
	}

}
