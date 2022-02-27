package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dao.IDao;
@Component("metier")
public class IMetierImp implements IMetier {

 private IDao idao;
	
	
	public IMetierImp(IDao idao) {
	super();
	this.idao = idao;
}
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
