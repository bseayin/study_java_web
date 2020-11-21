package com.xsz.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xsz.jdbc.Resource;
import com.xsz.jdbc.ResourceDao;
import com.xsz.jdbc.User;
import com.xsz.jdbc.UserDao2;

/**
 * Servlet implementation class DeleteUserServlet
 */
@WebServlet("/UpdateResourceServlet")
public class UpdateResourceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateResourceServlet() {
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
		String type=request.getParameter("type");
		String content=request.getParameter("content");
		String id=request.getParameter("id");
		
		//String 转int
		int id2=Integer.parseInt(id);
		//验证前端输入的用户名和密码是否存在数据库
		ResourceDao jdbc=new ResourceDao();
		Resource res=new Resource();
		 res.setContent(content);
		 res.setType(type);
		 res.setId(id2);
		
        boolean f=jdbc.updateById(res);

        if(f){
        	
        	response.sendRedirect("resourcetable.html");
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
