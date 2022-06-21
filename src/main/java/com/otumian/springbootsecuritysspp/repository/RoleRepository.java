package com.otumian.springbootsecuritysspp.repository;

import com.otumian.springbootsecuritysspp.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
