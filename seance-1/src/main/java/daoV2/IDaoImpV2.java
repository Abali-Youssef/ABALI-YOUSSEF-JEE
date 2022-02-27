package daoV2;

import dao.IDao;

public class IDaoImpV2 implements IDao {
	public double getData() {
		// TODO Auto-generated method stub
		System.out.println("version n°1 ");
		return Math.PI*5*Math.pow(Math.PI, 6);
	}
}
