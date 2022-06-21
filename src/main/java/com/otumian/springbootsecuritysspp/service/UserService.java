package com.otumian.springbootsecuritysspp.service;

import com.otumian.springbootsecuritysspp.domain.Role;
import com.otumian.springbootsecuritysspp.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
