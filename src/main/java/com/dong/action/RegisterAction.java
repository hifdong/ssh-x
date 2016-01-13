package com.dong.action;

import com.dong.model.User;
import com.dong.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

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

    public String execute() {
        userName=this.getUserName();
        password = this.getPassword();
        Map<String, Object> paramMap = new HashMap<String, Object>();
        try {
            List<User> userList = userService.queryUserList(paramMap);
            System.out.print(userList.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (userName.equals("dong") && password.equals("dong")) {
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
}
