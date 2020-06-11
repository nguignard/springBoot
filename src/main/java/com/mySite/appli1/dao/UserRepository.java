package com.mySite.appli1.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mySite.appli1.model.User;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByLogin(String login);

}
