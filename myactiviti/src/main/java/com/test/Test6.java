package com.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;

import java.util.List;

public class Test6 {
    //查询部署的流程定义
    public static void main(String[] args) {
        ProcessEngine pe =
                ProcessEngines.getDefaultProcessEngine();

        //查询部署对象的信息
        /*Deployment d= pe.getRepositoryService()
                .createDeploymentQuery()
                .deploymentId("1")
                .list().get(0);
        System.out.println(d.getId()+","+d.getName()+","+d.getDeploymentTime());*/

        //查询流程定义的信息
      /* ProcessDefinition definition =
                pe.getRepositoryService()
                .createProcessDefinitionQuery()
                .deploymentId("1")//根据部署的id查询流程定义的信息
                .processDefinitionKey("myactiviti")//通过流程定义的key值进行查询
                *//*.processDefinitionKeyLike("%act%")//通过流程定义的key模糊查询*//*
                *//*.orderByProcessDefinitionVersion().asc()*//*
                .orderByProcessDefinitionVersion().desc()
                .list().get(0);
        System.out.println("流程定义的id："+definition.getId());
        System.out.println("流程定义的key:"+definition.getKey());
        System.out.println("流程定义的name："+definition.getName());
        System.out.println("流程定义的资源文件:"+definition.getResourceName());
        System.out.println("流程定义图片文件:"+definition.getDiagramResourceName());
        System.out.println("流程定义的版本:"+definition.getVersion());*/

        //删除流程定义
        pe.getRepositoryService()
             .deleteDeployment("20001");
        System.out.println("删除流程定义");

        //删除同key的多版本流程定义
        /*List<ProcessDefinition> list= pe.getRepositoryService()
                .createProcessDefinitionQuery()
                .processDefinitionKey("myactiviti")
                .orderByProcessDefinitionVersion().desc()
                .list();
        for (ProcessDefinition definition : list) {
            System.out.println("版本:"+definition.getVersion());
            pe.getRepositoryService()
                    .deleteDeployment(definition.getDeploymentId());
        }*/


    }
}
