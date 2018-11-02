package com.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricProcessInstance;

import java.util.List;

public class Test12 {
    public static void main(String[] args) {
        //历史流程查询
        ProcessEngine pe= ProcessEngines.getDefaultProcessEngine();
       /* List<HistoricProcessInstance> list=
                pe.getHistoryService()
                        .createHistoricProcessInstanceQuery()
                        .processDefinitionId("myactiviti:1:12504")
                        .list();

        for (HistoricProcessInstance historicProcessInstance:list) {
            System.out.println(historicProcessInstance.getId()+","+ historicProcessInstance.getName()+"," +
                    historicProcessInstance.getStartTime()  );
        }*/


        //历史活动
        List<HistoricActivityInstance> list2=
                pe.getHistoryService()
                        .createHistoricActivityInstanceQuery()
                        .processInstanceId("15001")
                        .list();
            for(HistoricActivityInstance historicActivityInstance :list2) {
            System.out.println(historicActivityInstance.getActivityName()+","+historicActivityInstance.getStartTime());
        }
    }



}
