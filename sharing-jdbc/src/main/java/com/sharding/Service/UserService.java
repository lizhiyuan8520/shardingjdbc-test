package com.sharding.Service;

import com.sharding.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    int InsertUser(User user);
    void InsertUsers();
}
