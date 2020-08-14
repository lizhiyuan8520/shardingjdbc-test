package com.sharding.Servicelmpl;

import com.sharding.Dao.userDao;
import com.sharding.Service.UserService;
import com.sharding.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Repository
@Slf4j
public class UserServiceImpl implements UserService {
    @Resource
    private userDao userDao;

    public int InsertUser(User user) {
        return userDao.InsertUser(user);
    }
    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    public  void InsertUsers()
    {
        User user=new User();
        for(int i=0;i<100;i++)
        {
            user.setUser_id(i);
            user.setUsername((char)i+"");
            user.setPassword("123456");
            int flag=userDao.InsertUser(user);
            if (flag > 0) {
                log.info("成功插入" + "------> " + user);
            } else {
                log.info("插入失败" + "------>" + user);
            }

        }
    }
}
