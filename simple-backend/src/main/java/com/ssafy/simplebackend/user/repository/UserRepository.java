package com.ssafy.simplebackend.user.repository;

import com.ssafy.simplebackend.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
