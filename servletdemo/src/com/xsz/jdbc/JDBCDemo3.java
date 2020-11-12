package com.xsz.jdbc;
import java.sql.*;

public class JDBCDemo3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JDBCDemo3 jdbc=new JDBCDemo3();
        Student student=new Student();
        student.setName("张三丰");
        student.setBirth("1999-03-03");
        student.setId("12");
        student.setSex("男");
//        jdbc.insert(student);
//        jdbc.delete("ss");
//        jdbc.update("小蓝","08");
        Student st=jdbc.getStudent("02");
        System.out.println(st.getName());
    }
    
//根据学号到数据库查询学生信息
public Student getStudent(String sid){
	Student s=new Student();
	try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //java10是数据库的名字
        String url="jdbc:mysql://localhost:3306/java12i?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        //登录数据库用户名
        String username="root";
        //登录数据库密码
        String pwd="XSZ202006a";
        Connection conn = DriverManager.getConnection(url,username,pwd);
        String sql="select * from student where s_id=?";
        PreparedStatement st=conn.prepareStatement(sql);
        st.setString(1,sid);
       
        ResultSet rs=st.executeQuery();
        while(rs.next()){
        	s.setBirth(rs.getString("s_birth"));
        	s.setId(rs.getString("s_id"));
        	s.setName(rs.getString("s_name"));
        	s.setSex(rs.getString("s_sex"));
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
	return s;
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
            String sql="insert into student (s_id,s_name,s_birth,s_sex) values (?,?,?,?)";
            PreparedStatement st=conn.prepareStatement(sql);
            st.setString(1,s.getId());
            st.setString(2,s.getName());
            st.setString(3,s.getBirth());
            st.setString(4,s.getSex());
            st.execute();
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
//            String sql="delete from student where s_id='"+sid+"'";
            String sql="delete from student where s_id=?";
            PreparedStatement st=conn.prepareStatement(sql);
            st.setString(1,sid);
            int rs=st.executeUpdate();
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

            String sql="update  student set s_name=? where s_id=?";
            PreparedStatement st=conn.prepareStatement(sql);
            st.setString(2,sid);
            st.setString(1,name);
            int rs=st.executeUpdate();
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
