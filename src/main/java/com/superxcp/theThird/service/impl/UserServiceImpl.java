package com.superxcp.theThird.service.impl;

import com.superxcp.theThird.dao.UserDao;
import com.superxcp.theThird.domain.User;
import com.superxcp.theThird.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by xcp on 2017/11/13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired //注入DAO
    private UserDao mUserDao;

    public User getUserByUsername(String username) {
        return mUserDao.getUserByUsername(username);
    }
}
