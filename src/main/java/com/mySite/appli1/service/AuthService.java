package com.mySite.appli1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mySite.appli1.dao.UserRepository;
import com.mySite.appli1.model.User;

@Service
public class AuthService implements UserDetailsService {

    @Autowired
    UserRepository userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
	username = "admin";
	User user = userDao.findByLogin(username);
	System.out.println(user);
	PrincipalUser principalUser = new PrincipalUser(user);
	return principalUser;
    }
}