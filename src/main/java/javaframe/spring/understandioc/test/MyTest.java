package javaframe.spring.understandioc.test;

import javaframe.spring.understandioc.dao.impl.UserDaoImpl;
import javaframe.spring.understandioc.dao.impl.UserDaoMysqlImpl;
import javaframe.spring.understandioc.dao.impl.UserDaoOracleImpl;
import javaframe.spring.understandioc.service.impl.UserServiceImpl;

/**
 * @author: Samuel
 * @date: 2021-06-03 16:49
 * @description: javaframe.spring.test
 */
public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        //待使用的对象不是由其自己创建，而是由容器创建
        UserDaoImpl userDaoImpl=new UserDaoImpl();
        //需要使用该对象时，将容器创建的对象注入
        userService.setUserDao(userDaoImpl);
        userService.getUser();

        System.out.println("-----------------");

        UserDaoMysqlImpl userDaoMysql=new UserDaoMysqlImpl();
        userService.setUserDao(userDaoMysql);
        userService.getUser();

        System.out.println("-----------------");

        UserDaoOracleImpl userDaoOracle=new UserDaoOracleImpl();
        userService.setUserDao(userDaoOracle);
        userService.getUser();
    }
}
