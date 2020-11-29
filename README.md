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

#### 前端html跟后台接口（API）打交道，一般两种方式
- html 表单form提交，通过action属性设置api的路径，这种方式的话， 
执行完成以后，一般需要页面跳转，这种需要页面跳转的api，一般在类的上面
会加注解 @Controller， 然后方法返回string类型的路径，就可以实现页面跳转了。

- ajax方法跟后台打交道，这种后台的接口，不负责页面跳转，只负责数据交互。
所以这种接口类上一般加@RestController， 返回json格式的数据（key:value）

- 在 @Controller 修饰的类里面的方法， 如果只想返回Json格式的数据，不要跳转的话，可以在
方法的上面添加 @ResponseBody 注解，这样就相当于@RestController里面的方法了。

###  SpringBoot  controller  各种接收参数的方式

#### 参考博客
https://blog.csdn.net/h356363/article/details/90510609

####  地址传值
@PathVariable
获取路径参数。即url/{id}这种形式。



## 更多学习资料关注微信公众号

![Image text](https://gitee.com/bseaworkspace/study_java_web/blob/master/doc/wechatlog.jpg)












