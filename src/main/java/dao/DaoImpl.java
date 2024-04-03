package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getdata() {
        /*
        se connecter a la BD
         */
        System.out.println("version base de données");
        double temp=Math.random()*40;
        return temp;
    }
}
