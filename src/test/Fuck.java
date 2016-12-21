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
		List infoborrow=new ArrayList();
		BookImpl b = new BookImpl(); 
		infoborrow = b.searchByStu("2141601029");
		

		for(int i=1;i<infoborrow.size();i++){
			System.out.println(infoborrow.get(i));
			System.out.println(infoborrow.get(i).toString().split("\\[|,|\\]")[1]);
//			Order order=(Order) infoborrow.get(i);
			//System.out.println(infoborrow.getClass());

		    
		}
	}

}
