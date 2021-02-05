package com.xsz.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
*
        * <p>Title: Select</p>
        * <p>Description: 自定义查询注解</p>
        * <p>Company: http://www.itheima.com/ </p>
        */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Select {
    String value();
}
