package test.com.sharding.Servicelmpl; 

import com.sharding.Dao.userDao;
import com.sharding.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/** 
* UserServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 13, 2020</pre> 
* @version 1.0 
*/
@Slf4j
public class UserServiceImplTest {
    @Autowired
    userDao userDao;
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: InsertUser(User user) 
* 
*/ 
@Test
public void testInsertUser() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: InsertUsers() 
* 
*/ 
@Test
@Transactional(rollbackFor = {RuntimeException.class, Error.class})
public void testInsertUsers() throws Exception {
//TODO: Test goes here...


        User user=new User();
        for(int i=0;i<100;i++)
        {
            user.setUser_id(i);
            user.setUsername((char)i+"");
            user.setPassword("123456");
            int flag=userDao.InsertUser(user);
            if (flag > 0) {
                log.info("�ɹ�����" + "------> " + user);
            } else {
                log.info("����ʧ��" + "------>" + user);
            }

        }


} 


} 
