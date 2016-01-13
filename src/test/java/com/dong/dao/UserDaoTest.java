package com.dong.dao;

import com.dong.model.User;
import com.dong.service.UserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.springframework.web.context.ContextLoader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: hifdong
 * @Date: 16/1/10.
 */
public class UserDaoTest {
    private UserService userService;




    @Test // 未整合spring前对hibernate配置测试
    public void testConnect() {
        Configuration config= new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        Transaction trans = session.beginTransaction();
        User user = new User();
        user.setUserName("testSave");
        user.setPassword("pas");
        session.save(user);
        trans.commit();
        session.close();
    }

//    @Test
//    public void testQueryUserList() {

//        UserService userService =  ContextLoader("");
//        Map<String, Object> paramMap = new HashMap<String, Object>();
//        try {
//            List<User> userList = userService.queryUserList();
//            assertTrue(userList.size() > 0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

}
