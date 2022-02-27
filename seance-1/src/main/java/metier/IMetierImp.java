package metier;

import dao.IDao;

public class IMetierImp implements IMetier {
 private IDao idao;
	public double calcul() {
		// TODO Auto-generated method stub
		
		System.out.println("IMetierImp :");
		
		return idao.getData()*Math.PI/3;
	}
	public IDao getIdao() {
		return idao;
	}
	public void setIdao(IDao idao) {
		this.idao = idao;
	}

}
