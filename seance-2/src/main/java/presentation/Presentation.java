package presentation;

import dao.IDao;
import dao.IDaoImp;
import daoV2.IDaoImpV2;
import metier.IMetierImp;

public class Presentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IDao id = new IDaoImp();
//IDao idV2 = new IDaoImpV2();
IMetierImp im = new IMetierImp(id);
//im.setIdao(id);
System.out.println(im.calcul());
	}

}
