package com.xsz.designpattern.signleton;

/**
 * 单列模式
 */
public class SignletonDemo {
    private String name;
    private static SignletonDemo signletonDemo=null;
    public static SignletonDemo getInstance(){
        if(signletonDemo==null){
            signletonDemo =new SignletonDemo();
        }
        return signletonDemo;
    }
    private SignletonDemo(){
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
