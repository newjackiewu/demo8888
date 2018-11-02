package com.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricVariableInstance;
import org.activiti.engine.task.Task;

import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        //得到工作流引擎对象
        ProcessEngine pe= ProcessEngines.getDefaultProcessEngine();
        //得到任务对象
        TaskService service =pe.getTaskService();
       /* Task task=service.createTaskQuery().taskId("17502").singleResult();

        //设置任务变量
        Users user=new Users();
        user.setUsername("睡过");
        user.setAge(18);
        user.setSex('男');
        service.setVariableLocal(task.getId(),"请假人",user);
        //  service.setVariable(task.getId(),"请假人","李四");
        // service.setVariable(task.getId(),"请假天数",5);
        service.setVariableLocal(task.getId(),"请假天数",15);
        service.setVariable(task.getId(),"请假开始时间","2018-1-1");
        service.setVariable(task.getId(),"请假结束时间","2018-10-10");

        Users u2=(Users) service.getVariable(task.getId(),"请假人");
        System.out.println("请假人:"+u2.getUsername());
        System.out.println("请假天数:"+service.getVariable(task.getId(),"请假天数"));

        //完成任务
        service.complete(task.getId());
        System.out.println("完成任务");*/


        //查询历史任务的变量
        List<HistoricVariableInstance> variableInstances=
                pe.getHistoryService()
                        .createHistoricVariableInstanceQuery()
                        .taskId("17502")
                        .list();

        for (HistoricVariableInstance variableInstance : variableInstances) {
            System.out.println(variableInstance.getVariableName()+","+variableInstance.getValue());
        }

    }
}
