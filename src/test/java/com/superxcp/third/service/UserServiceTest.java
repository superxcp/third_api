package com.superxcp.third.service;

import com.superxcp.theThird.domain.User;
import com.superxcp.theThird.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xcp on 2017/11/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/*.xml"})
public class UserServiceTest {
    Logger mLogger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserService mUserService;

//    @Test
//    public void save() {
//        User user = new User();
//        user.setUsername("ly");
//        user.setUserpass("1234");
//        mUserService.save(user);
//    }

}
