package com.otumian.springbootsecuritysspp.repository;

import com.otumian.springbootsecuritysspp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
