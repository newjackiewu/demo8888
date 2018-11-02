package com.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.repository.ProcessDefinition;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Test7 {
    public static void main(String[] args) {
        //查询部署的流程定义
        ProcessEngine pe=
                ProcessEngines.getDefaultProcessEngine();
        try {
            //查看流程图
            ProcessDefinition processDefinition=
                    pe.getRepositoryService()
                            .createProcessDefinitionQuery()
                            .deploymentId("12501")
                            .list().get(0);

            String name=processDefinition.getDiagramResourceName();
            System.out.println("流程定义的图片:"+name);
            File f=new File("D:\\"+name);
            //通过名字得到输入流,参数:部署id和文件名字
            InputStream
                    in=pe.getRepositoryService().getResourceAsStream("12501", name);
            //复制出文件
            FileUtils.copyInputStreamToFile(in,f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
