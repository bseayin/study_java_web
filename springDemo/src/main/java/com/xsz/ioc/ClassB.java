package com.xsz.ioc;

/**
 * ClassB依赖ClassA
 */
public class ClassB {
    private ClassA a;
    private ClassC c;
    ClassB(ClassA a,ClassC c){
        this.a=a;
        this.c=c;
    }
}
