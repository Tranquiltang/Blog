package cn.com.blog.dao;

import java.util.List;

import cn.com.blog.entity.User;

public interface IUser {
	//添加用户
	boolean addUser();
	//修改用户信息
	boolean updateUserInfo();
	//删除用户
	boolean deleteUser(String name);
	//查询所有用户
	List<User> queryAllUser();
	//按姓名查找用户
	List<User> queryUserByName(String name);
}
