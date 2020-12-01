# study_java_web
## 介绍
### Java基础学习
#### 源码
https://gitee.com/bseaworkspace/study_java_web/tree/master/corejava-demo

###  Servlet学习--实战项目 学生管理&资料管理
#### 源码
https://gitee.com/bseaworkspace/study_java_web/tree/master/servletdemo
###  SpringBoot 入门
#### 源码
https://gitee.com/bseaworkspace/study_java_web/tree/master/springbootbasic
#### 环境搭建
1. 配置pom文件
2. 创建启动类，启动类上的注解是 @SpringBootApplication
3. 创建测试controller类，注意controller类必须是在启动类的包
的同级或者下一级。 conroller类的上面加@RestController这个注解
表示这个类的返回值都默认转换成json格式
在controller的方法上面加 @RequestMapping("/hello") 表示设置
方法的拦截路径是hello
#### 配置文件使用方法
1. springboot 配置文件名字必须是application.properties
并且放在resoures下面
2. 通过 @Value("${myversion}")可以获取配置文件上的自定义属性的值
3. 下面是两个在配置文件中的常用设置 
    #####端口号
   server.port=9001
   #####相对于项目名字
   server.servlet.context-path=/springboot1

#### 参考博客

#####  环境搭建
https://blog.csdn.net/h356363/article/details/98381244
##### 常用注解
https://blog.csdn.net/h356363/article/details/94054756

###  SpringBoot 集成 JPA
#### 源码

https://gitee.com/bseaworkspace/study_java_web/tree/master/springbootJPA
#### 参考博客

SpringBoot2 学习3 集成JPA
https://blog.csdn.net/h356363/article/details/98523963

SpringBoot2 学习4 JPA 查询

https://blog.csdn.net/h356363/article/details/98786017

#### 环境搭建
1. 在pom添加包
 <!--  添加JPA的支持 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
2.  配置文件中设置相关属性
 
spring.datasource.url = jdbc:mysql://localhost:3306/java12i?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=UTF-8
spring.datasource.username = root
spring.datasource.password = XSZ202006a
spring.datasource.driverClassName = com.mysql.jdbc.Driver
spring.jpa.database = MYSQL
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

#### 注解

- @Entity 表示是一个实体类，一个实体类对应一个数据库表
- Spring data JPA 采用hibernate实现，通过entity可以反向生成数据表

#### 前端和后台API通信的两种方式

- form 表单提交，一般需要后台控制页面跳转，所以API类上加 @Controller
- ajax 局部刷新，页面不跳转，后台API只负责数据交互，所以API类上加 @RestController 返回
Json格式的数据
- 另外如果@Controller类里面的方法，也想只返回数据，不做页面跳转，可以在方法的上面加 @ResponseBody
来实现

###  SpringBoot  接收参数的各种方式

#### 参考博客
https://blog.csdn.net/h356363/article/details/90510609

###  SpringBoot  集成MyBatis

#### 集成具体步骤  参考博客 
https://blog.csdn.net/h356363/article/details/100548024
#### 自动生成代码 mybatis generator参考博客 
https://blog.csdn.net/h356363/article/details/90649491
#### 源码
https://gitee.com/bseaworkspace/study_java_web/tree/master/springbootMybatis



## 更多学习资料 请关注微信公众号

![个人学习微信公众号](https://images.gitee.com/uploads/images/2020/1127/113142_f6ab57bb_768204.jpeg "qrcode_for_gh_caf4624e6df8_258.jpg")












