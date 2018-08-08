package com.superxcp.third.dao;

import com.superxcp.theThird.dao.UserDao;
import com.superxcp.theThird.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xcp on 2017/11/11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/*.xml"})
public class UserDaoTest {
    @Resource
    private UserDao mUserDao;

//    @Test
//    public void save() {
//        User user = new User();
//        user.setUserId(1L);
//        user.setUsername("jack");
//        user.setUserpass("1234");
//        mUserDao.save(user);
//    }


}
