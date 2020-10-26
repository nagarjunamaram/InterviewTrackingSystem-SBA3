package com.wellsfargo.interview.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.interview.entity.UserEntity;

@Repository
public interface UserDAO extends JpaRepository<UserEntity, Integer>{

}
