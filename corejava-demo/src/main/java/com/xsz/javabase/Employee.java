package com.xsz.javabase;
//类可以看成是创建 Java 对象的模板。
/**
 * 类是模板，创建具体的对象需要用这个模板
 * @author Administrator
 *
 */
public class Employee {
	// String name="张三"  这样叫声明并且赋值
	/**
	 * 如果分成两个步骤写，可以是先声明，再赋值
	 * String name;  //先声明
	 * name="张三"  //再赋值
	 * 
	 */
	   String name;
	   int age;
	   double salary;
	   /**
	    * 方法的名字和类的名字一样，表示构造方法
	    * 所有的类都有一个默认的无参构造方法
	    * 下面这个是有参数的构造方法，需要自己手写
	    * 
	    */
	   public Employee(String name2,double salary2){
		   this.name=name2;
		   this.salary=salary2;
	   }
	   
	   /**
	    * 这里是员工类的一个方法，这个方法返回这个员工的工资
	    * @return
	    */
	   public double getSalary(){
		   return this.salary;
	   }
	   
	   
	   

}
