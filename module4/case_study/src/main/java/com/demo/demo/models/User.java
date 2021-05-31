package com.demo.demo.models;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import java.util.Set;

@Entity
public class User {
    @Id
    @Size(min = 30, max = 255)
    private String userName;
    @Max(255)
    private String passWord;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "username"))
    private Set<Role> roles;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
