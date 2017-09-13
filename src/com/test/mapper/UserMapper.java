package com.test.mapper;

import com.test.model.User;

/**
 * @Description:Mapper映射类
 * @author: Lee
 * @time:Sep 13, 2017 4:48:24 PM
 */
public interface UserMapper {
	
	public User selectUserById(int usreId);
	

}
