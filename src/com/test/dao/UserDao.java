package com.test.dao;

import com.test.model.User;

/**
 * @Description:Dao接口层
 * @author: Lee
 * @time:Sep 13, 2017 4:50:51 PM
 */
public interface UserDao {
	
	public User findUserById(int id);

}
