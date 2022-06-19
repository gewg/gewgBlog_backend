package com.gewgblog.backend.dao;

import com.gewgblog.backend.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 对t_user增删改查
 */
public interface UserRepository extends JpaRepository<User, Long> {
    // 根据用户名和密码查询User
    User findByUsernameAndPassword(String username, String password);
}
