package com.xsz.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xsz.jdbc.User;
import com.xsz.jdbc.UserDao2;

/**
 * Servlet implementation class DeleteUserServlet
 */
@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//解决中文乱码问题
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//获取前端传入值
		String username=request.getParameter("username");
		String userpwd=request.getParameter("userpwd");
		String age=request.getParameter("age");
		String sex=request.getParameter("sex");
		String mobile=request.getParameter("mobile");
		
		//验证前端输入的用户名和密码是否存在数据库
		 UserDao2 jdbc=new UserDao2();
		 User user=new User();
		 user.setName(username);
		 user.setPwd(userpwd);
		 user.setSex(sex);
		 user.setMobile(mobile);
		 user.setRole("普通用户");
		 //String 转int 类型
		int age2= Integer.parseInt(age);
		user.setAge(age2);
		
        boolean f=jdbc.updateByName(user);

        if(f){
        	
        	response.sendRedirect("usertable2.html");
        }else{
//	        	response.getWriter().append("欢迎"+u1.getName()+"登录成功！");
        	
        	response.getWriter().append("添加失败");
        	
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
