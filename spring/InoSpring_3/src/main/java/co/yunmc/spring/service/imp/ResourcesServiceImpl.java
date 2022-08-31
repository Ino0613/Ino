package co.yunmc.spring.service.imp;

import co.yunmc.spring.dao.ResourcesDao;
import co.yunmc.spring.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourcesServiceImpl implements ResourcesService {

    @Autowired
    private ResourcesDao resourcesDao;

    @Override
    public boolean openURL(String url, String password) {
        return resourcesDao.readResources(url,password);
    }

}
