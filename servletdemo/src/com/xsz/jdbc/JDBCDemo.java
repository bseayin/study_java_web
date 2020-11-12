package com.xsz.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //java10是数据库的名字
            String url="jdbc:mysql://localhost:3306/java12i?useSSL=false&serverTimezone=UTC";
            //登录数据库用户名
            String username="root";
            //登录数据库密码
            String pwd="XSZ202006a";
            Connection conn = DriverManager.getConnection(url,username,pwd);

            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from student");
            while(rs.next()){
                System.out.println("名字"+rs.getString("s_name"));
                System.out.println("性别"+rs.getString("s_sex"));
            }

            rs.close();
            st.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
