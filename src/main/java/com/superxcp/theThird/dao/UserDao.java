package com.superxcp.theThird.dao;

import com.superxcp.theThird.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xcp on 2017/11/13
 */
public interface UserDao {

    public User getUserByUsername(String username);
}
