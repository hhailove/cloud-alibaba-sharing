package cn.hih.sharing.nacosactivitiprovider.controller;

import cn.hih.sharing.nacosactivitiprovider.service.ActivitiService;
import cn.hih.sharing.nacosactivitiprovider.vo.ActivitiRequestParam;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @classname: ProcessController
 * @description: 工作流控制器
 * @author: Mr.Huang
 * @date: 2019-03-27 11:39
 **/
@RestController
@RequestMapping("/process")
public class ActivitiProcessController {
    @Autowired
    private ActivitiService activitiService;

    @PostMapping
    public void start(String processKey){
        activitiService.startProcessByKey(processKey);
    }

    @PutMapping
    public void complate(){
        List<Task> tasks = activitiService.getTasks("");
        Task task = tasks.get(0);
        activitiService.complate(task);
    }


    @GetMapping("/task")
    public void getTasks(String assginee){
        List<Task> tasks = activitiService.getTasks(assginee);
        for (Task task : tasks){
            System.out.println(task.getTaskDefinitionKey());
        }
    }

}
