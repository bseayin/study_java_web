package com.xsz.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xsz.jdbc.User;
import com.xsz.jdbc.UserDao;
import com.xsz.jdbc.UserDao2;

/**
 * Servlet implementation class LoginServlet2
 */
@WebServlet("/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//解决中文乱码问题
				response.setCharacterEncoding("utf-8");
				response.setContentType("text/html;charset=utf-8");
				//获取前端传入值
				String username=request.getParameter("username");
				String userpwd=request.getParameter("userpwd");
				String type=request.getParameter("type");
				 UserDao2 jdbc=new UserDao2();
				 User u1=null;
				if("管理员".equals(type)){
					u1=jdbc.getUser2(username, userpwd);
				}else{
					u1=jdbc.getUser(username, userpwd);
				}
		       
		        System.out.println("欢迎"+u1.getName()+"登录成功！");
		        if(u1.getName()==null){
		        	response.getWriter().append("登录失败");
		        }else{
//		        	response.getWriter().append("欢迎"+u1.getName()+"登录成功！");
		        	//如果登录成功，就跳转到新的html页面
		        	response.sendRedirect("userinfo.html");
		        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
