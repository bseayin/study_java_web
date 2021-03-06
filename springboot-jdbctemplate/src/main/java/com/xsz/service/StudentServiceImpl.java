package com.xsz.service;

import com.xsz.entity.Student;
import java.util.List;
import java.util.Map;
import com.sun.org.apache.bcel.internal.generic.LSTORE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.swing.plaf.basic.BasicTreeUI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public String getAllUsers(){
        return jdbcTemplate.queryForObject("select count(1) from STUDENT", String.class);
    }

    @Override
    public List<Map<String, Object>> findAll() {
        String sql = "select * from sTUDENT";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public Student getById(int id) {
        String sql = "select * from student where id = ? ";
        List<Student> stu = jdbcTemplate.query(sql,new Object[]{id}, new StudentRowMapper());
        Student student = null;
        if(!stu.isEmpty()){
            student = stu.get(0);
        }
        return student;
    }

    /**
     * 插入用户-防止sql注入-可以返回该条记录的主键
     * @param student
     * @return
     */
    @Override
    public int addStu(Student student) {
        String sql = "insert into student(id,name,sex,age) values(null,?,?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        System.out.println(student);
        int resRow = jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql,new String[]{"id","name","sex","age"});
                ps.setString(1,student.getName());
                ps.setInt(2,student.getSex());
                ps.setInt(3,student.getAge());
                return ps;
            }
        },keyHolder);
        System.out.println("操作记录数："+resRow+" 主键："+keyHolder.getKey());
        return Integer.parseInt(keyHolder.getKey().toString());
    }

    @Override
    public int deleteStu(int id) {
        String sql = "delete from student where id = ?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public int updateStu(Student student) {
        String sql = "update student set name=?,sex=?,age=? where id=?";
        int res = jdbcTemplate.update(sql, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement) throws SQLException {
                preparedStatement.setString(1,student.getName());
                preparedStatement.setInt(2,student.getSex());
                preparedStatement.setInt(3,student.getAge());
                preparedStatement.setInt(4,student.getId());
            }
        });
        return res;
    }

    @Override
    public int isHasStu(int id) {
        String sql = "select * from student where id=?";
        List<Student> student = jdbcTemplate.query(sql, new Object[]{id}, new StudentRowMapper());
        if (student!=null && student.size()>0){
            return 1;
        } else {
            return 0;
        }
    }
}


class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet resultSet,int i) throws SQLException{
        Student stu = new Student();
        stu.setId(resultSet.getInt("id"));
        stu.setAge(resultSet.getInt("age"));
        stu.setSex(resultSet.getInt("sex"));
        stu.setName(resultSet.getString("name"));
        return stu;
    }
}

