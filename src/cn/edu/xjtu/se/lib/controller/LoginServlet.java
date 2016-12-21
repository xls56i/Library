package cn.edu.xjtu.se.lib.controller;

import cn.edu.xjtu.se.lib.dao.*;
import cn.edu.xjtu.se.lib.entity.User;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;




/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		User user = null;
		UserDao userdao=new UserImpl();
		
		
		String idCard = request.getParameter("idCard");
		String password=request.getParameter("password");
		user = userdao.searchUserByIdCard(idCard);
		
		if( user!=null )
		{
			if (password.equals(user.getPassword())) {
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				//用户借阅信息ArrayList
				request.getRequestDispatcher("views/user/ReaderInfo.jsp").forward(request, response);
			}
			else{
				System.out.println("密码错误");
				request.setAttribute("error", "fail");
			    request.getRequestDispatcher("views/user/login.jsp").forward(request, response);
			}
		}
		
		else{
			System.out.println("用户名不存在");
		    request.setAttribute("error", "fail");
		    request.getRequestDispatcher("views/user/login.jsp").forward(request, response);
		}
		
		
		
	}

}
