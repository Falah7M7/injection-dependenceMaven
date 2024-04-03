package ext;

import dao.IDao;

public class DaoImplVWS implements IDao {
    @Override
    public double getdata() {
        System.out.println("Version web service");
        return 9;
    }
}
