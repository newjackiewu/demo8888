package com.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.runtime.ProcessInstance;

public class Test8 {
    public static void main(String[] args) {
        ProcessEngine pe=
                ProcessEngines.getDefaultProcessEngine();

        //启动流程定义
        //查看act_ru_exection 查看流程信息
        //查看act_ru_task任务
        ProcessInstance instance=   //流程实例
                pe.getRuntimeService()
                .startProcessInstanceByKey("myactiviti");
        System.out.println(instance.getName()+","+instance.getId());

    }
}

