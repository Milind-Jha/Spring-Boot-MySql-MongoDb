package com.milind.multipledbconnect.repository;

import com.milind.multipledbconnect.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
