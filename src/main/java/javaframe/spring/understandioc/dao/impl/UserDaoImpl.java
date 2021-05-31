package javaframe.spring.understandioc.dao.impl;

import javaframe.spring.understandioc.dao.UserDao;

/**
 * @author: Samuel
 * @date: 2021-06-03 16:45
 * @description: javaframe.spring.dao.impl
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取用户");
    }
}
