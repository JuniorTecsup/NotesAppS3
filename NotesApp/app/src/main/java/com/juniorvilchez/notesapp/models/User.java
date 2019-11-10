package com.juniorvilchez.notesapp.models;

import com.orm.dsl.Table;

@Table
public class User {

    private Long id;
    private String user_name;
    private String user_full_name;
    private String user_email;
    private String password;

    public User() {
    }

    public User(String user_name, String user_full_name, String user_email, String password) {
        this.user_name = user_name;
        this.user_full_name = user_full_name;
        this.user_email = user_email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_full_name() {
        return user_full_name;
    }

    public void setUser_full_name(String user_full_name) {
        this.user_full_name = user_full_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", user_full_name='" + user_full_name + '\'' +
                ", user_email='" + user_email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
