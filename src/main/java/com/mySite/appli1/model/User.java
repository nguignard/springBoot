package com.mySite.appli1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String login;
    @Transient
    private String passWord;
    private String passWordConfirmd;

    public User() {
    }

    public User(String login, String passWord) {
    }

    public String getLogin() {
	return login;
    }

    public void setLogin(String login) {
	this.login = login;
    }

    public String getPassWord() {
	return passWord;
    }

    public void setPassWord(String passWord) {
	this.passWord = passWord;
    }

    public String getPassWordConfirmd() {
	return passWordConfirmd;
    }

    public void setPassWordConfirmd(String passWordConfirmd) {
	this.passWordConfirmd = passWordConfirmd;
    }

}
