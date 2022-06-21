package com.otumian.springbootsecuritysspp.service;

import com.otumian.springbootsecuritysspp.domain.Role;
import com.otumian.springbootsecuritysspp.domain.User;
import com.otumian.springbootsecuritysspp.repository.RoleRepository;
import com.otumian.springbootsecuritysspp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public User saveUser(User user) {
        log.info("save user");
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("save role");
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("add role to user");
        User user = userRepository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
        // userRepository.save(user);
        // because of the transactional, it saves it automatically
    }

    @Override
    public User getUser(String username) {
        log.info("get user by username");
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("get users");
        return userRepository.findAll();
    }
}
