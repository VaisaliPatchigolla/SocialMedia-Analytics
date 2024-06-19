package com.socialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialMedia.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsernameAndPassword(String username, String password);
}

