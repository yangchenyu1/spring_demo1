package com.yueqian.spring.dao.Account;

import com.yueqian.spring.bean.User;

import java.util.List;

public interface AccountDao {
    public int save(User user);
    public int update();
    public List<User> find();
}
