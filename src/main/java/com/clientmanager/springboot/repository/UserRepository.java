package com.clientmanager.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clientmanager.springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
