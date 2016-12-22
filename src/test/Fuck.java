package test;

import java.util.ArrayList;
import java.util.List;


import cn.edu.xjtu.se.lib.dao.UserDao;
import cn.edu.xjtu.se.lib.dao.*;
import cn.edu.xjtu.se.lib.entity.Order;
import cn.edu.xjtu.se.lib.entity.User;

public class Fuck {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		List infoborrow=new ArrayList();
//		BookImpl b = new BookImpl(); 
//		infoborrow = b.searchByStu("2141601029");
//		
//
//		for(int i=1;i<infoborrow.size();i++){
//			System.out.println(infoborrow.get(i));
//			System.out.println(infoborrow.get(i).toString().split("\\[|,|\\]")[1]);
//			Order order=(Order) infoborrow.get(i);
			//System.out.println(infoborrow.getClass());

		    
//		}
//		ArrayList<User> us = new ArrayList<User>();
//		UserImpl u = new UserImpl();
//		us = u.displayAllUser();
//		for (int i = 0; i < us.size(); i++) {
//			System.out.println(us.get(i));
//		}
//		
		Sssttu s1 = new Sssttu("1", "2", "3", "4", "5");
		Sssttu s2 = new Sssttu("1", "2", "3", "4", "5");
		ArrayList b = new ArrayList();
		b.add(s1);
		b.add(s2);
		ArrayList a = null;
		a = (ArrayList)b.get(1);
		System.out.println(a);
		
	}

}
