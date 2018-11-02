package com.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.task.Task;

import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        ProcessEngine pe=
                ProcessEngines.getDefaultProcessEngine();

        //查询个人任务
       /*List<Task> list=
                pe.getTaskService()
                        .createTaskQuery()
                        .taskAssignee("张三")//根据任务的执行人去查看任务
                        .list();
        for (Task task : list) {
            System.out.println(task.getId()+","+task.getCreateTime()+","+task.getExecutionId()+"," +
                    task.getProcessDefinitionId());
        }*/

        //完成个人任务
        /*pe.getTaskService().complete("15004");
        System.out.println("完成任务");*/

        //查询个人的历史任务
      /*  List<HistoricTaskInstance> list=
                pe.getHistoryService()
                        .createHistoricTaskInstanceQuery()
                        //.taskId("10001") // .taskAssignee("张三")
                        //.executionId("10001")
                        .processDefinitionKey("myactiviti")
                        .list();
        for (HistoricTaskInstance historicTaskInstance : list) {
            System.out.println(historicTaskInstance.getStartTime()+
                    ","+historicTaskInstance.getEndTime()
                    +","+historicTaskInstance.getProcessDefinitionId());
        }*/



    }
}
