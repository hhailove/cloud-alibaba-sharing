package cn.hih.sharing.nacosactivitiprovider.service;

import org.activiti.engine.*;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @classname: ActivitiService
 * @description: 工作流服务类
 * @author: Mr.Huang
 * @date: 2019-03-27 11:40
 **/
@Service
public class ActivitiService {
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;

    public void startProcessByKey(String processKey){
        Map<String, Object> variables = new HashMap<>(8);
        variables.put("employeeName", "Kermit");
        variables.put("numberOfDays", new Integer(4));
        variables.put("vacationMotivation", "I'm really tired!");
        System.out.println("1 Number of process instances: " + runtimeService.createProcessInstanceQuery().count());

        runtimeService.startProcessInstanceByKey("vacationRequest", variables);

        System.out.println("2 Number of process instances: " + runtimeService.createProcessInstanceQuery().count());

    }


    public void complate(Task task){

        Map<String, Object> taskVariables = new HashMap<>(8);
        taskVariables.put("vacationApproved", "false");
        taskVariables.put("managerMotivation", "We have a tight deadline!");
        System.out.println("1 Number of process active instances: " + runtimeService.createProcessInstanceQuery().count());
        taskService.complete(task.getId(), taskVariables);
        System.out.println("2 Number of processactive  instances: " + runtimeService.createProcessInstanceQuery().count());
    }
    public List<Task> getTasks(String assignee){
        List<Task> tasks = taskService.createTaskQuery().taskCandidateGroup("management").list();
        for (Task task : tasks) {
            System.out.println("Task available: " + task.getName());
        }
        return tasks;
    }




}
