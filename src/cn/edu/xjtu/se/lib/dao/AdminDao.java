package cn.edu.xjtu.se.lib.dao;

import cn.edu.xjtu.se.lib.entity.Admin;

public interface AdminDao {
	//增加一个管理员(注意管理员权限)
	Admin addAdmin(Admin a);
	//删除一个管理员(注意管理员权限)
	boolean removeAdmin(Admin a);
	//更新管理员(注意管理员权限)
	Admin updateAdminPwd(Admin a);
	Admin updateAdminPhone(Admin a);
	Admin updateAdminPrio(Admin a);
	//通过用户名搜索管理员(注意管理员权限)
	Admin searchByAdminName(String adminName);
	
}
