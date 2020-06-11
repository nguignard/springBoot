package com.mySite.appli1.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mySite.appli1.model.User;

public class PrincipalUser implements UserDetails {
    private User user;

    public PrincipalUser(User user) {
	if (user == null) {
	    throw new UsernameNotFoundException("L'utilisateur n'existe pas.");
	}
	this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
	List<GrantedAuthority> myAuthorities = new ArrayList<GrantedAuthority>();
	myAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
	return myAuthorities;
    }

    @Override
    public String getPassword() {
	return this.user.getPassWord();
    }

    @Override
    public String getUsername() {
	return this.user.getLogin();
    }

    @Override
    public boolean isAccountNonExpired() {
	return true;
    }

    @Override
    public boolean isAccountNonLocked() {
	return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
	return true;
    }

    @Override
    public boolean isEnabled() {
	return true;
    }
}