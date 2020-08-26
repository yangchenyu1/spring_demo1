package com.yueqian.spring.dao.Account;

import com.yueqian.spring.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("accountDao")
public class IAccountDao implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(User user) {
        String sql = "insert into users (uname,uage) value(?,?)";
        return jdbcTemplate.update(sql,new Object[]{user.getUname(),user.getUage()});

    }

    @Override
    public int update() {

        return 0;
    }

    @Override
    public List<User> find() {
        return null;
    }
}
