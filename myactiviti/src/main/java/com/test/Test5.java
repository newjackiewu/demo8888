package com.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;

import java.io.InputStream;
import java.util.zip.ZipInputStream;

public class Test5 {
    //通过压缩文件部署流程定义（将流程图发布到数据库中）
    public static void main(String[] args) {
        //1.先得到流程引擎对象
        ProcessEngine pe =
                ProcessEngines.getDefaultProcessEngine();
        //2.得到服务对象
        RepositoryService repositoryService = pe.getRepositoryService();

        //3.创建流程定义，添加资源文件

        //得到压缩文件的流信息
        InputStream in =
                Test5.class.getClassLoader().getResourceAsStream("myactiviti.zip");
        ZipInputStream zipInputStream = new ZipInputStream(in);
        DeploymentBuilder builder =
                repositoryService.createDeployment().addZipInputStream(zipInputStream);
        //4.部署（发布流程）
        Deployment deployment = builder.deploy();

        //查询部署的id信息
        System.out.println(deployment.getId()+","+deployment.getName());

    }
}
