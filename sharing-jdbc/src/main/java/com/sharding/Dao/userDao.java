package com.sharding.Dao;

import com.sharding.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userDao {
    int InsertUser(User user);
    void InsertUsers();
}
