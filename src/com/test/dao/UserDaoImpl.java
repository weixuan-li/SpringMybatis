package com.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.mapper.UserMapper;
import com.test.model.User;

/**
 * @Description:Dao实现层
 * @author: Lee
 * @time:Sep 13, 2017 4:58:42 PM
 */
@Component 
public class UserDaoImpl implements UserDao{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User findUserById(int id){
		
		User user = userMapper.selectUserById(id);
		
		return user;
	}

}
