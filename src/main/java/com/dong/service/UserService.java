package com.dong.service;

import com.dong.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by hifdong on 16/1/10.
 */
public interface UserService {
    List<User> queryUserList(Map<String, Object> paramMap);
}
