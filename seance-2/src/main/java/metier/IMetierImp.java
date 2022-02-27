package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.IDao;
@Component("metier")
public class IMetierImp implements IMetier {
@Autowired	
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
