package metier;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    private IDao dao;
    public MetierImpl(IDao dao)
    {
        this.dao=dao;
    }
    @Override
    public double calcul() {
        double tmp=dao.getdata();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
    /* injecter dans la variable dao un objet */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
