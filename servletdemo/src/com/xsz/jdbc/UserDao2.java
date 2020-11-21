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



//根据姓名查询用户
public User getUserById(int id){
		User u=new User();
      Connection conn = DBConnection.getConn();
      String sql="select * from user where id=? ";
      ResultSet rs;
		try {
			PreparedStatement st=conn.prepareStatement(sql);
	        st.setInt(1,id);
			rs = st.executeQuery();
			 while(rs.next()){
		        	u.setAge(rs.getInt("age"));
		        	u.setName(rs.getString("name"));
		        	u.setPwd(rs.getString("pwd"));
		        	u.setSex(rs.getString("sex"));
		        	u.setMobile(rs.getString("mobile"));
		        	u.setId(rs.getInt("id"));
		        	
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
      	u.setId(rs.getInt("id"));
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

    
    
  //根据姓名修改用户
    public boolean updateById(User s){
        boolean f=false;
        try {
            
            Connection conn = DBConnection.getConn();
            String sql="update user set age=?,mobile=?,name=? where id=?";
            PreparedStatement st=conn.prepareStatement(sql);
            st.setInt(1,s.getAge());
            st.setInt(4,s.getId());
            st.setString(3,s.getName());
            st.setString(2, s.getMobile());
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
    public boolean delete(int id){
        boolean f=false;
        try {
        	Connection conn = DBConnection.getConn();
            String sql="delete from user where id=?";
            PreparedStatement st=conn.prepareStatement(sql);
            st.setInt(1,id);
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




}
