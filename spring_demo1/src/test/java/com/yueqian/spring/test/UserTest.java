package com.yueqian.spring.test;

import com.yueqian.spring.bean.User;
import com.yueqian.spring.dao.AccountService.AccountService;
import com.yueqian.spring.dao.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void test() {
        User user = new User();
        user.setUname("张三");
        user.setUage("11");
        accountService.save(user);

    }

}
