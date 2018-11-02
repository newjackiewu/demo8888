package com.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;


public class Test3 {
    public static void main(String[] args) {
        //获得工作流引擎对象
        //注意：配置
        ProcessEngine pe = ProcessEngines.getDefaultProcessEngine();
        System.out.println(pe);
    }


}
