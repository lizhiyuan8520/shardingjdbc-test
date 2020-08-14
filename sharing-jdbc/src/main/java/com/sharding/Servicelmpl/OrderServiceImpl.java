package com.sharding.Servicelmpl;

import com.sharding.Dao.orderDao;
import com.sharding.Service.OrderService;
import com.sharding.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class OrderServiceImpl implements OrderService {

    @Resource
    orderDao orderDao;
    public void InsertOrder(Order order) {
            orderDao.InsertOrder(order);
    }
}
