package cn.edu.xjtu.se.lib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cn.edu.xjtu.se.lib.entity.Admin;
import cn.edu.xjtu.se.lib.entity.User;

public class AdminImpl implements AdminDao {
	//数据库连接对象
	private Connection conn = null;
	private Statement st = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	
	@Override
	public Admin addAdmin(Admin a) {
		// TODO Auto-generated method stub
		String adminName = a.getAdminName();
		String password = a.getPassword();
		String name = a.getName();
		String phone = a.getPhoneNumber();
		String prio = a.getPriority();
		
		
		conn = DBConnection.getConnection();
		if(conn == null){
			System.out.println("数据库没有连接");
			return null;
		}
		try {
			String sql="" +
					"insert into Admin" +
					"(adminName,password,name,phoneNumber,priority)" +
					"values(" +
					"?,?,?,?,?)";
			PreparedStatement ptmt=conn.prepareStatement(sql);
			System.out.println(sql);
			ptmt.setString(1,adminName);
			ptmt.setString(2, password);
			ptmt.setString(3, name);
			ptmt.setString(4, phone);
			ptmt.setString(5, prio);
			ptmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally{
			DBConnection.close(conn, st, rs);
		}
		return a;
	}

	@Override
	public boolean removeAdmin(Admin a) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Connection conn=DBConnection.getConnection();
		if(conn == null){
			System.out.println("数据库没有连接");
			return false;
		}
		
		try {
			String sql="" +
					" delete from Admin " +
					" where adminName=? ";
			PreparedStatement ptmt;
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, a.getAdminName());
			ptmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag = false;
		} finally{
			DBConnection.close(conn, st, rs);
		}
		return flag;
	}

	@Override
	public Admin updateAdminPwd(Admin a) {
		// TODO Auto-generated method stub
		Connection conn=DBConnection.getConnection();
		if(conn == null){
			System.out.println("数据库没有连接");
			return null;
		}
		
		try {
			String sql="" +
					" update Admin " +
					" set password=? " +
					" where adminName=? ";
			PreparedStatement ptmt;
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, a.getPassword());
			ptmt.setString(2, a.getAdminName());
			ptmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBConnection.close(conn, st, rs);
		}
		return a;

	}
	
	@Override
	public Admin updateAdminPhone(Admin a) {
		// TODO Auto-generated method stub
		Connection conn=DBConnection.getConnection();
		if(conn == null){
			System.out.println("数据库没有连接");
			return null;
		}
		
		try {
			String sql="" +
					" update Admin " +
					" set phoneNumber=? " +
					" where adminName=? ";
			PreparedStatement ptmt;
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, a.getPhoneNumber());
			ptmt.setString(2, a.getAdminName());
			ptmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBConnection.close(conn, st, rs);
		}
		return a;

	}

	
	@Override
	public Admin updateAdminPrio(Admin a) {
		// TODO Auto-generated method stub
		Connection conn=DBConnection.getConnection();
		if(conn == null){
			System.out.println("数据库没有连接");
			return null;
		}
		
		try {
			String sql="" +
					" update Admin " +
					" set priority=? " +
					" where adminName=? ";
			PreparedStatement ptmt;
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, a.getPriority());
			ptmt.setString(2, a.getAdminName());
			ptmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBConnection.close(conn, st, rs);
		}
		return a;

	}
	@Override
	public Admin searchByAdminName(String adminName) {
		// TODO Auto-generated method stub
		Connection conn=DBConnection.getConnection();
		StringBuilder sb=new StringBuilder();
		sb.append("select * from Admin ");
		sb.append(" where adminName=?");
		Admin a = null;
		try {
			PreparedStatement ptmt;
			ptmt = conn.prepareStatement(sb.toString());
			ptmt.setString(1, adminName);
			
			System.out.println(sb.toString());
			ResultSet rs=ptmt.executeQuery();
			while(rs.next()){
				a = new Admin();
				a.setAdminName(rs.getString("adminName"));
				a.setName(rs.getString("name"));
				a.setPhoneNumber(rs.getString("phoneNumber"));
				a.setPriority(rs.getString("priority"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}

		return a;
	}

}
