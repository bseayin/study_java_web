package com.xsz.javabase;
//����Կ����Ǵ��� Java �����ģ�塣
/**
 * ����ģ�壬��������Ķ�����Ҫ�����ģ��
 * @author Administrator
 *
 */
public class Employee {
	// String name="����"  �������������Ҹ�ֵ
	/**
	 * ����ֳ���������д�����������������ٸ�ֵ
	 * String name;  //������
	 * name="����"  //�ٸ�ֵ
	 * 
	 */
	   String name;
	   int age;
	   double salary;
	   /**
	    * ���������ֺ��������һ������ʾ���췽��
	    * ���е��඼��һ��Ĭ�ϵ��޲ι��췽��
	    * ����������в����Ĺ��췽������Ҫ�Լ���д
	    * 
	    */
	   public Employee(String name2,double salary2){
		   this.name=name2;
		   this.salary=salary2;
	   }
	   
	   /**
	    * ������Ա�����һ����������������������Ա���Ĺ���
	    * @return
	    */
	   public double getSalary(){
		   return this.salary;
	   }
	   
	   
	   

}
