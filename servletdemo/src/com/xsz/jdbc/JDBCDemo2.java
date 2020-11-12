package com.xsz.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCDemo2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JDBCDemo2 jdbc=new JDBCDemo2();
        Student student=new Student();
        student.setName("张三");
        student.setBirth("1999-03-03");
        student.setId("11");
        student.setSex("男");
//        jdbc.insert(student);
//        jdbc.delete("10");
        jdbc.update("小蓝","08");
    }


    //增
    public boolean insert(Student s){
        boolean f=false;
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
            String sql="insert into student (s_id,s_name,s_sex,s_birth) values('"+s.getId()+"','"+s.getName()+"','"+s.getSex()+"','"+s.getBirth()+"')";
            int rs=st.executeUpdate(sql);
            if(rs>0){
                f=true;
            }
            st.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return f;


    }

    //删
    public boolean delete(String sid){
        boolean f=false;
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
            String sql="delete from student where s_id='"+sid+"'";
            int rs=st.executeUpdate(sql);
            if(rs>0){
                f=true;
            }
            st.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return f;


    }


    //修改
    public boolean update(String name,String sid ){
        boolean f=false;
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
            String sql="update student set s_name='"+name+"' where s_id='"+sid+"' ";
            int rs=st.executeUpdate(sql);
            if(rs>0){
                f=true;
            }
            st.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return f;


    }


}