package com.lixing.provider;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao  extends JpaRepository<User,Long> {
}
