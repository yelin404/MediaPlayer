package com.example.musicplayer.DataBase;

public class UserBean {

    public String account;
    public String password;

    public UserBean(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public UserBean() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
