package com.xsz.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 元注解释义:
 * java.lang.annotation提供了四种元注解，专门注解其他的注解（在自定义注解的时候，需要使用到元注解）：
 * @Documented –注解是否将包含在JavaDoc中
 * @Retention –什么时候使用该注解
 * @Target –注解用于什么地方
 * @Inherited – 是否允许子类继承该注解
 *
 */
@Documented
@Retention(RUNTIME)
@Target(METHOD)
public @interface LoginAnno {

}
