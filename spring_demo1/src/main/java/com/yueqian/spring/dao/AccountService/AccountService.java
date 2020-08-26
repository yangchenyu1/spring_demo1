package com.yueqian.spring.dao.AccountService;

import com.yueqian.spring.bean.User;

import java.util.List;
public interface AccountService {
    public void save(User user);
    public int update();
    public List<User> find();
}
