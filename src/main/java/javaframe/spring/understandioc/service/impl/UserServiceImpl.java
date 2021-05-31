package javaframe.spring.understandioc.service.impl;

import javaframe.spring.understandioc.dao.UserDao;
import javaframe.spring.understandioc.service.UserService;

/**
 * @author: Samuel
 * @date: 2021-06-03 16:47
 * @description: javaframe.spring.service.impl
 */
public class UserServiceImpl implements UserService {
    //private UserDao userDao=new UserDaoImpl();
    //private UserDao userDao=new UserDaoMysqlImpl();
    //private UserDao userDao=new UserDaoOracleImpl();
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
