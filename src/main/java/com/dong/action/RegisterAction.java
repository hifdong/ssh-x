package com.dong.action;

import com.dong.model.User;
import com.dong.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hifdong on 16/1/9.
 */
public class RegisterAction extends ActionSupport {
    private String userName;
    private String password;
    private UserService userService;
    private User user;

    public String execute() {
        userName=this.getUserName();
        password = this.getPassword();
        Map<String, Object> paramMap = new HashMap<String, Object>();
        List<User> userList = new ArrayList<User>();
        try {
            userList = userService.queryUserList(paramMap);
            System.out.print(userList.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean isAuth = false;
        for (int i = 0; i < userList.size(); i++) {
            if (userName != null && userName.length() > 0 && userName.equals(userList.get(i).getUserName())
                    && password != null && password.length() > 0 && password.equals(userList.get(i).getPassword())) {
                isAuth = true;
                break;
            }
        }
        if (isAuth) {
            return SUCCESS;
        } else {
            return INPUT;
        }


    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
