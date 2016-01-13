package com.dong.daoImpl;

import com.dong.dao.UserDao;
import com.dong.model.User;
import com.dong.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Map;

/**
 * Created by hifdong on 16/1/10.
 */
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<User> queryUserList(Map<String, Object> paramMap) {
        StringBuffer hql = new StringBuffer("from user u ");

        Session session = sessionFactory.openSession();
        Query query = session.createQuery(hql.toString());
        List<User> userList = query.list();
        session.close();
        return userList;

    }
}
