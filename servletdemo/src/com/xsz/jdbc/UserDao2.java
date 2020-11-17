package com.xsz.jdbc;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        UserDao2 jdbc=new UserDao2();
        User u1=jdbc.getUser("小红", "123456");
        System.out.println("欢迎"+u1.getName()+"登录成功！");
       
    }
    
//普通用户登录
public User getUser(String name,String userpwd){
		User u=new User();
        Connection conn = DBConnection.getConn();
        String sql="select * from user where name=? and pwd=? and role='普通用户'";
        ResultSet rs;
		try {
			PreparedStatement st=conn.prepareStatement(sql);
	        st.setString(1,name);
	        st.setString(2, userpwd);
			rs = st.executeQuery();
			 while(rs.next()){
		        	u.setAge(rs.getInt("age"));
		        	u.setName(rs.getString("name"));
		        	u.setPwd(rs.getString("pwd"));
		        	u.setSex(rs.getString("sex"));
		       }
		        
	        st.close();
	        conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
    
	return u;
}


//管理员登录
public User getUser2(String name,String userpwd){
		User u=new User();
      Connection conn = DBConnection.getConn();
      String sql="select * from user where name=? and pwd=? and role='管理员'";
      ResultSet rs;
		try {
			PreparedStatement st=conn.prepareStatement(sql);
	        st.setString(1,name);
	        st.setString(2, userpwd);
			rs = st.executeQuery();
			 while(rs.next()){
		        	u.setAge(rs.getInt("age"));
		        	u.setName(rs.getString("name"));
		        	u.setPwd(rs.getString("pwd"));
		        	u.setSex(rs.getString("sex"));
		       }
		        
	        st.close();
	        conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
  
	return u;
}


//获取所有的用户
//java 集合： 数组，List,Map
public List<User> getAllUser(){
	List<User> list=new ArrayList();
	try {
	 Connection conn = DBConnection.getConn();
      String sql="select * from user ";
      PreparedStatement st=conn.prepareStatement(sql);
     
     
      ResultSet rs=st.executeQuery();
      while(rs.next()){
    	 User u=new User();
      	u.setAge(rs.getInt("age"));
      	u.setName(rs.getString("name"));
      	u.setPwd(rs.getString("pwd"));
      	u.setSex(rs.getString("sex"));
      	u.setMobile(rs.getString("mobile"));
      	list.add(u);
      }
      
      st.close();
      conn.close();
  
  } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
  }
	return list;
}
    
    //增
    public boolean insert(User s){
        boolean f=false;
        try {
            
            Connection conn = DBConnection.getConn();
            String sql="insert into user (age,name,pwd,sex,role,mobile) values (?,?,?,?,?,?)";
            PreparedStatement st=conn.prepareStatement(sql);
            st.setInt(1,s.getAge());
            st.setString(2,s.getName());
            st.setString(3,s.getPwd());
            st.setString(4,s.getSex());
            st.setString(5, s.getRole());
            st.setString(6, s.getMobile());
            int rs=st.executeUpdate();
            if(rs>0){
            	f=true;
            }
            st.close();
            conn.close();
       
          
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return f;


    }

    //根据姓名删除用户
    public boolean delete(String name){
        boolean f=false;
        try {
        	Connection conn = DBConnection.getConn();
            String sql="delete from user where name=?";
            PreparedStatement st=conn.prepareStatement(sql);
            st.setString(1,name);
            int rs=st.executeUpdate();
            if(rs>0){
                f=true;
            }
            st.close();
            conn.close();
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
