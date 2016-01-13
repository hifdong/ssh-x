package com.dong.serviceImpl;

import com.dong.dao.UserDao;
import com.dong.model.User;
import com.dong.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * Created by hifdong on 16/1/10.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public List<User> queryUserList(Map<String, Object> paramMap) {
        return this.userDao.queryUserList(paramMap);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
