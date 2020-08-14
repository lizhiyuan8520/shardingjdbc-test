package com.sharding.Service;

import com.sharding.entity.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    void InsertOrder(Order order);
}
