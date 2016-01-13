package com.dong.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by hifdong on 16/1/9.
 */

//@Entity
//@Table(name = "USER")
public class User {
    private Long id;
    private String userName;
    private String password;


//    @Id
//    @GeneratedValue(generator = "increment")
//    @GenericGenerator(name = "increment", strategy="increment")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    @Column(name="USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

//    @Column(name="USER_PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User userForm = (User) o;

        if (userName != null ? !userName.equals(userForm.userName) : userForm.userName != null) return false;
        return !(password != null ? !password.equals(userForm.password) : userForm.password != null);

    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }


}
