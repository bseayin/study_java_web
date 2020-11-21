package com.xsz.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.xsz.jdbc.Resource;
import com.xsz.jdbc.ResourceDao;
import com.xsz.jdbc.User;
import com.xsz.jdbc.UserDao2;

/**
 * Servlet implementation class DeleteUserServlet
 */
@WebServlet("/FindResourceByIdServlet")
public class FindResourceByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindResourceByIdServlet() {
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
		String id=request.getParameter("id");
		id=id.substring(1);
		//String 转int
		int id2=Integer.parseInt(id);
		ResourceDao jdbc=new ResourceDao();
		/**
		 * 两句合并成一句是一样的效果
		 *  Resource u1=jdbc.getResourceById(id2);
		 */
		 Resource u1=null;
		 u1=jdbc.getResourceById(id2);
		 String rs=JSONObject.toJSONString(u1);
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
