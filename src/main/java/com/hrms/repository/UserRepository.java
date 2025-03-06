package com.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hrms.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
