package co.yunmc.spring.service.imp;


import co.yunmc.spring.dao.AccountDao;
import co.yunmc.spring.domain.Account;
import co.yunmc.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }


    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    @Override
    public void delete(Integer id) {
        accountDao.delete(id);
    }

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }


    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

}
