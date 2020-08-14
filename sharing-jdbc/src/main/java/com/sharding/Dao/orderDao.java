package com.sharding.Dao;

import com.sharding.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface orderDao {
    void InsertOrder(Order order);
}
