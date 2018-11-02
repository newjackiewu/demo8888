package com.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;

import java.io.InputStream;
import java.util.zip.ZipInputStream;

public class Test10 {
    public static void main(String[] args) {
        //1.先得到流程引擎对象
        ProcessEngine pe=
                ProcessEngines.getDefaultProcessEngine();
        //2.得到服务对象
        RepositoryService repositoryService= pe.getRepositoryService();
        //3.创建流程定义,添加资源文件

        //得到压缩文件的流信息
        InputStream in=
                Test5.class.getClassLoader().getResourceAsStream("myactiviti.zip");
        ZipInputStream zipInputStream=new ZipInputStream(in);
        DeploymentBuilder builder=
                repositoryService.
                        createDeployment()
                        .name("这是部署的name值")
                        .addZipInputStream(zipInputStream);
        //4.部署(发布流程)
        Deployment deployment= builder.deploy();
        //5.查询部署的id信息
        System.out.println(deployment.getId()+","+deployment.getName());
    }
}
