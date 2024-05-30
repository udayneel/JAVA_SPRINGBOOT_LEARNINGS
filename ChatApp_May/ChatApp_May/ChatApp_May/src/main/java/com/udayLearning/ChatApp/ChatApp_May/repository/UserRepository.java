package com.udayLearning.ChatApp.ChatApp_May.repository;

import com.udayLearning.ChatApp.ChatApp_May.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
