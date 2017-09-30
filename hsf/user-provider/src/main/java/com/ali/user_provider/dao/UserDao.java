package com.ali.user_provider.dao;

import java.util.ArrayList;

import com.ali.api.domain.User;

/**
 * 数据持久层接口
 * @author Administrator
 */
public interface UserDao {
	/**
	 * 添加用户
	 * @param user
	 * @return 影响的记录条数
	 */
	public int addUser(User user);
	/**
	 * 根据姓名模糊查询所有用户
	 * @param name
	 * @return 符合条件的对象集合
	 */
	public ArrayList<User> queryUserByName(String name);
}
