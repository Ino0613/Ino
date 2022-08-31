package co.yunmc.spring.dao.imp;

import co.yunmc.spring.dao.ResourcesDao;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class ResourcesDaoImpl implements ResourcesDao {

    @Override
    public boolean readResources(String url, String password) {
        return password.equals("root");
    }
}
