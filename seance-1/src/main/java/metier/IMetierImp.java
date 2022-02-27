package metier;

import dao.IDao;

public class IMetierImp implements IMetier {
 private IDao idao;
	public double calcul() {
		return idao.getData()*Math.PI/3;
	}
	public IDao getIdao() {
		return idao;
	}
	public void setIdao(IDao idao) {
		this.idao = idao;
	}

}
