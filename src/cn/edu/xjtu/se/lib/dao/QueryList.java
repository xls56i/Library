package cn.edu.xjtu.se.lib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class QueryList {
	//数据库连接对象
		private Connection conn = null;
		private Statement st = null;
		private PreparedStatement pst = null;
		private ResultSet rs = null;
		
	public ArrayList queryReturnList(String sql){
		ArrayList al = new ArrayList();
		ResultSetMetaData rsmd = null;
		String colname[];
		int columns;
		conn = DBConnection.getConnection();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);//得到查询结果一个数据集
			if(rs == null)
				al = null;
			else{
				rsmd = rs.getMetaData();//得到结果集的结构信息，比如字段数、字段名等。
				columns = rsmd.getColumnCount();//得到数据集的列数
				colname = new String[columns];
				for(int i = 1; i <= columns; i++)
					colname[i-1] = rsmd.getColumnName(i);//数据库列的名字
				
				ArrayList al_colname = new ArrayList();
				for(int i = 1; i <= columns; i++)
					al_colname.add(colname[i-1]);
				al.add(al_colname);//把结果集中各条记录依次放入返回list中的其他行
				//al的第一行是列名的数组
				while(rs.next()){
					ArrayList alRow = new ArrayList();
					for(int i = 1; i <= columns; i++)
						alRow.add(rs.getString(colname[i-1]));//alRow是类的集合
					al.add(alRow);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			al = null;
		} finally{
			DBConnection.close(conn, st, rs);
		}
		return al;
	}
}
