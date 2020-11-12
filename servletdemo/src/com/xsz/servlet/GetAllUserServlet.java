package com.xsz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.xsz.jdbc.User;
import com.xsz.jdbc.UserDao;

/**
 * Servlet implementation class GetAllUserServlet
 */
@WebServlet("/GetAllUserServlet")
public class GetAllUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllUserServlet() {
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
				//验证前端输入的用户名和密码是否存在数据库
				 UserDao jdbc=new UserDao();
		        List<User> list=jdbc.getAllUser();
		        String rs=JSONObject.toJSONString(list);
		        response.getWriter().append(rs);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
