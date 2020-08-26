package com.yueqian.spring.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.lang.reflect.Method;
import java.util.*;

@Service("userService")//<!-- 配置目标类 service--><bean id="userService" class="com.yueqian.spring.dao.UserServiceImpl"></bean>
public class UserServiceImpl implements UserService {

    public int save(int a, int b) {
        System.out.println("run....");
        return a+b;
    }



}
