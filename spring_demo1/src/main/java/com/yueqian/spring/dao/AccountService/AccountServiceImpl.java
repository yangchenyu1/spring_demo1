package com.yueqian.spring.dao.AccountService;

import com.yueqian.spring.bean.User;
import com.yueqian.spring.dao.Account.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService{
    @Autowired
    public AccountDao accountDao;
    @Override
    public void save(User user) {
        accountDao.save(user);

    }

    @Override
    public int update() {
        return accountDao.update();
    }

    @Override
    public List<User> find() {
        return accountDao.find();
    }
}
