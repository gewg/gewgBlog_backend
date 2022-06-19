package com.gewgblog.backend.service;

import com.gewgblog.backend.po.User;

public interface UserService {
    public User checkUser(String userName, String password);
}
