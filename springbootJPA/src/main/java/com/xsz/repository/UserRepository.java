package com.xsz.repository;

import com.xsz.entity.Student;
import com.xsz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    /**
     * findBy是jpa查询的固定写法
     * 后面接User类的属性名字，如果需要多个查询条件，可以使用 And连接
     *
     * @param username
     * @param password
     * @return
     */
    public User findByUserNameAndPassword(String username,String password);
    public User findByUserNameAndPasswordAndRole(String username,String password,String role);

}
