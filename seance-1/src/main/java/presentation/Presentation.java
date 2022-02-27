package presentation;

import dao.IDao;
import dao.IDaoImp;
import metier.IMetierImp;

public class Presentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IDao id = new IDaoImp();
IMetierImp im = new IMetierImp();
im.setIdao(id);
System.out.println(im.calcul());
	}

}
