package com.example.servingwebcontent.repo;

import com.example.servingwebcontent.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
