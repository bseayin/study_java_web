package com.xsz.jdbc;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ResourceDao {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ResourceDao jdbc=new ResourceDao();
       
    }
public Resource getResourceById(int id){
		Resource u=new Resource();
      Connection conn = DBConnection.getConn();
      String sql="select * from Resource where id=? ";
      ResultSet rs;
		try {
			PreparedStatement st=conn.prepareStatement(sql);
	        st.setInt(1,id);
			rs = st.executeQuery();
			 while(rs.next()){
		        	u.setContent(rs.getString("content"));
		        	u.setType(rs.getString("type"));
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



//获取所有的用户
//java 集合： 数组，List,Map
public List<Resource> getAllResource(){
	List<Resource> list=new ArrayList();
	try {
	 Connection conn = DBConnection.getConn();
      String sql="select * from Resource ";
      PreparedStatement st=conn.prepareStatement(sql);
     
     
      ResultSet rs=st.executeQuery();
      while(rs.next()){
    	 Resource u=new Resource();
    	 u.setContent(rs.getString("content"));
     	u.setType(rs.getString("type"));
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
    public boolean insert(Resource s){
        boolean f=false;
        try {
            
            Connection conn = DBConnection.getConn();
            String sql="insert into Resource (type,content) values (?,?)";
            PreparedStatement st=conn.prepareStatement(sql);
            st.setString(1,s.getType());
            st.setString(2,s.getContent());
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
    public boolean updateById(Resource s){
        boolean f=false;
        try {
            
            Connection conn = DBConnection.getConn();
            String sql="update Resource set type=?,content=? where id=?";
            PreparedStatement st=conn.prepareStatement(sql);
            st.setString(1,s.getType());
            st.setString(2,s.getContent());
            st.setInt(3, s.getId());
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
    public boolean delete(int id){
        boolean f=false;
        try {
        	Connection conn = DBConnection.getConn();
            String sql="delete from Resource where id=?";
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
