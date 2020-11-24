# study_java_web
### 介绍
##### Java基础学习
https://gitee.com/bseaworkspace/study_java_web/tree/master/corejava-demo

#####  Servlet学习--实战项目 学生管理&资料管理
https://gitee.com/bseaworkspace/study_java_web/tree/master/servletdemo
#####  SpringBoot 入门
###### 环境搭建
1. 配置pom文件
2. 创建启动类，启动类上的注解是 @SpringBootApplication
3. 创建测试controller类，注意controller类必须是在启动类的包
的同级或者下一级。 conroller类的上面加@RestController这个注解
表示这个类的返回值都默认转换成json格式
在controller的方法上面加 @RequestMapping("/hello") 表示设置
方法的拦截路径是hello
###### 配置文件使用方法
1. springboot 配置文件名字必须是application.properties
并且放在resoures下面
2. 通过 @Value("${myversion}")可以获取配置文件上的自定义属性的值
3. 下面是两个在配置文件中的常用设置 
    #######端口号
   server.port=9001
   #######相对于项目名字
   server.servlet.context-path=/springboot1

###### 参考博客
######## 环境搭建
https://blog.csdn.net/h356363/article/details/98381244
######## 常用注解
https://blog.csdn.net/h356363/article/details/94054756





