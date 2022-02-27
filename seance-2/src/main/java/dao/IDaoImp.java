package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class IDaoImp implements IDao {

	public double getData() {
		// TODO Auto-generated method stub
		System.out.println("version n°1 Idao ");
		return Math.PI*5*Math.pow(Math.PI, 6);
	}
}
