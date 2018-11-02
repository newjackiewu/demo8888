package com.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;

public class Test1 {
    //初始化数据库
    public static void main(String[] args) {
        ProcessEngineConfiguration configuration =
                ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
        //指定数据库的连接信息
        configuration.setJdbcUrl("jdbc:mysql://localhost:3306/bpmn1?createDatabaseIfNotExist=true");
        configuration.setJdbcDriver("com.mysql.jdbc.Driver");
        configuration.setJdbcUsername("root");
        configuration.setJdbcPassword("root");
        //设置数据表的操作模式
        configuration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
        System.out.println("数据库操作");
        //得到工作流引擎
        ProcessEngine pe = configuration.buildProcessEngine();
        System.out.println(pe);


    }
}
