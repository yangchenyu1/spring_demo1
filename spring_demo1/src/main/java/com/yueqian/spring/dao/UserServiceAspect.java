package com.yueqian.spring.dao;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component("myAspect")//<!--配置切面类--><bean id="userAspect" class="com.yueqian.spring.dao.UserServiceAspect"></bean>
@Aspect//<aop:aspect ref="userAspect">
public class UserServiceAspect {
    /**
     * 前置通知 try中 在目标方法执行前
     */
    @Before(value = "execution(* *..*.save*(..))",argNames = "joinPoint")
    public void before(JoinPoint joinPoint){
        System.out.println("before....");
        System.out.println("joinPoint"+joinPoint);
        Object[] obj = joinPoint.getArgs();
        for (Object o: obj) {
            System.out.println(o);
        }



    }

    /**
     * 后置通知 try中，在目标方法执行后
     */
    @AfterReturning(value = "execution(* *..*.save*(..))",returning = "obj")
    public void after(Object obj){
        System.out.println("after....");
        System.out.println("obj-----:"+obj);
    }
/**
 * 抽取公共部分
 */
@Pointcut("execution(* *..*.save*(..))")
public void poincut(){

}
    /**
     * 环绕通知 (等同于 前置加后置)
     */
    @Around(value = "UserServiceAspect.poincut()",argNames = "joinPoint")
    public Object round(ProceedingJoinPoint joinPoint) throws Throwable {
        Object obj = null;

        try {
            System.out.println("round.1...");
             obj = joinPoint.proceed();//放行 让目标方法执行
            System.out.println("round.2...");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("round.3...");
        } finally {
            System.out.println("round.4...");
        }
        System.out.println(obj);
        return obj;

    }

    /**
     * 异常通知 在catch 中
     */
    public void throwing(){
        System.out.println("throwing....");
    }

    /**
     * 结束通知
     */
    public void end(){
        System.out.println("end....");
    }
}
