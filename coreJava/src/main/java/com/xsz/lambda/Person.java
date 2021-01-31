package com.xsz.lambda;

public class Person {
    private String name;
    private int age;

    public  Person(String name){
        this.name=name;
    }
    public  Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){

        return "姓名："+this.name+"/ 年龄："+this.age;
    }


    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof Person) {
            Person anotherString = (Person)anObject;

                return this.name.equals(anotherString.getName());
            }

        return false;
    }
}
