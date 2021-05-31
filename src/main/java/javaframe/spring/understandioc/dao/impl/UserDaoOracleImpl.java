package javaframe.spring.understandioc.dao.impl;

import javaframe.spring.understandioc.dao.UserDao;

/**
 * @author: Samuel
 * @date: 2021-06-03 16:54
 * @description: javaframe.spring.dao.impl
 */
public class UserDaoOracleImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("从Oracle获取用户数据");
    }
}
