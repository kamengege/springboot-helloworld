package com.tedu.respository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tedu.bootdemo.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
