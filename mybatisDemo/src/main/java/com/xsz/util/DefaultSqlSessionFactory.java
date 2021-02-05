package com.xsz.util;

import java.io.InputStream;

public class DefaultSqlSessionFactory  implements SqlSessionFactory {
    private InputStream config = null;
    public void setConfig(InputStream config) {
        this.config = config;
    }
    @Override
    public SqlSession openSession() {
        DefaultSqlSession session = new DefaultSqlSession();
//调用工具类解析 xml 文件
        XMLConfigBuilder.loadConfiguration(session, config);
        return session;
    }
}
