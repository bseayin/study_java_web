package com.xsz.util;

public interface SqlSession {
    /**
     * 创建 Dao 接口的代理对象
     * @param daoClass
     * @return
     */
    <T> T getMapper(Class<T> daoClass);
    /**
     * 释放资源
     */
    void close();
}
