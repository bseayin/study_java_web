package com.xsz.util;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * <p>Title: DataSourceUtil</p>
 * <p>Description: 数据源的工具类</p>
 * <p>Company: http://www.itheima.com/ </p>
 */
public class DataSourceUtil {

        /**
         * 获取连接
         * @param cfg
         * @return
         */
        public static Connection getConnection(Configuration cfg) {
            try {
                Class.forName(cfg.getDriver());
                Connection conn =
                        DriverManager.getConnection(cfg.getUrl(),cfg.getUsername() , cfg.getPassword());
                return conn;
            } catch (Exception e) {
                throw new RuntimeException(e);
            } }
}
