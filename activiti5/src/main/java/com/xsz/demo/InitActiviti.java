package com.xsz.demo;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;

public class InitActiviti {

    public static void main(String[] args) throws Exception {

        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
        //定义连接mysql数据库
        configuration.setJdbcDriver("com.mysql.cj.jdbc.Driver");
        configuration.setJdbcUrl("jdbc:mysql://localhost:3306/db_activitidemo?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&nullCatalogMeansCurrent=true");
        configuration.setJdbcUsername("root");
        configuration.setJdbcPassword("XSZ202006a");

       /*  public static final String DB_SCHEMA_UPDATE_FALSE = "false";操作activiti23张表的时候，如果表不存在，就抛出异常，不能自动创建23张表
         public static final String DB_SCHEMA_UPDATE_CREATE_DROP = "create-drop";每次操作，都会先删除表，再创建表
         public static final String DB_SCHEMA_UPDATE_TRUE = "true";
         如果表不存在，就创建表，如果表存在，就直接操作		*/

        configuration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_CREATE_DROP);
        //activiti核心对象（流程引擎）
        ProcessEngine processEngine = configuration.buildProcessEngine();
        System.out.println("processEngine："+processEngine);

    }
}
