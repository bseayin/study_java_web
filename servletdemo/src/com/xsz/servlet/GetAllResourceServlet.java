package com.xsz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.xsz.jdbc.Resource;
import com.xsz.jdbc.ResourceDao;
import com.xsz.jdbc.User;
import com.xsz.jdbc.UserDao;
import com.xsz.jdbc.UserDao2;

/**
 * Servlet implementation class GetAllUserServlet2
 */
@WebServlet("/GetAllResourceServlet")
public class GetAllResourceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllResourceServlet() {
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
		//验证前端输入的用户名和密码是否存在数据库
		ResourceDao jdbc=new ResourceDao();
        List<Resource> list=jdbc.getAllResource();
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
