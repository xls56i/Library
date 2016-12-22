package cn.edu.xjtu.se.lib.dao;

import java.util.ArrayList;
import java.util.List;

import cn.edu.xjtu.se.lib.entity.Order;
import cn.edu.xjtu.se.lib.entity.User;

public interface UserDao {
	//增加用户
	User addUser(User u);
	//删除用户
	boolean removeUser(User u);
	//更新用户密码
	User updatePsw(User u);
	//更新用户状态
	User updateStatus(User u);
	//更新用户可借数量
	User updateNum(User u);
	//通过学号搜索用户
	User searchUserByIdCard(String idCard);
	//通过isbn搜索借阅订单
	ArrayList<Order> searchUserByIsbn(String isbn);
	//显示所有用户信息
	ArrayList<User> displayAllUser();
}
