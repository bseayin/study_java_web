package com.xsz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	//被static修饰的方法，叫静态方法。可以直接通过类名执行方法
	public static Connection getConn(){
		 Connection conn=null;
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//java10是数据库的名字
	         String url="jdbc:mysql://localhost:3306/db_study?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	         //登录数据库用户名
	         String username="root";
	         //登录数据库密码
	         String pwd="XSZ202006a";
	         conn = DriverManager.getConnection(url,username,pwd);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
         return conn;
	} 

}
