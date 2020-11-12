package com.xsz.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xsz.jdbc.JDBCDemo3;
import com.xsz.jdbc.Student;

/**
 * Servlet implementation class StudentServlet2
 */
@WebServlet("/StudentServlet2")
public class StudentServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sid=request.getParameter("sid");
		String uname=request.getParameter("ssssname");
		JDBCDemo3 jdbc=new JDBCDemo3();
		 Student student=new Student();
	        student.setName(uname);
	        student.setBirth("1999-03-03");
	        student.setId(sid);
	        student.setSex("男");
	        jdbc.insert(student);
		response.getWriter().append("add student"+uname);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
