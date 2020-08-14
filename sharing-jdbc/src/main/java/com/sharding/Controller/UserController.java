package com.sharding.Controller;

import com.sharding.Service.OrderService;
import com.sharding.Service.UserService;
import com.sharding.entity.Order;
import com.sharding.entity.User;
import com.sharding.mes.message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;
    @PostMapping("/shardingtest/insertuser")
    public message<User> InsertUser(@RequestBody User user) {
        return userService.InsertUser(user)>0?message.MesBulid("200","scuessful",user):message.MesBulid("500","insert error",user);
    }
    @GetMapping("/shardingtest/insertusers")
    public void InsertUsers() {
        userService.InsertUsers();
    }
    @RequestMapping("/shardingtest/insertorder")
    public void Insertorder(@RequestBody Order order)
    {
        order.setCreate_time(new Timestamp(System.currentTimeMillis()));
        orderService.InsertOrder(order);
    }


}
