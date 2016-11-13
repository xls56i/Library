package test;

import cn.edu.xjtu.se.lib.dao.UserDao;
import cn.edu.xjtu.se.lib.dao.UserImpl;
import cn.edu.xjtu.se.lib.entity.User;

public class Fuck {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		User user =  new User();
		UserDao userdao=new UserImpl();
		user.setIdCard("123333");//学号
		user.setName("许");
		user.setPhone("123");
		user.setPassword("as");
		user.setTotal_num(10);//最多借书数量
		user.setAlready_num(0);
		user.setStatus("normal"); //normal limit 
		
		userdao.addUser(user);
		
	}

}
