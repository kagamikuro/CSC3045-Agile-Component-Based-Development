package uk.ac.qub.agile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.ac.qub.agile.entry.Task;
import uk.ac.qub.agile.service.TaskService;
import uk.ac.qub.agile.utils.ResponseMessage;

@Controller
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/task/search")
    @ResponseBody //serialize to json
    public ResponseMessage searchTask(@RequestParam String taskName ){

        System.out.println("Receive request /task/search");

        Task task = new Task();
        task.setTitle(taskName);

        boolean result = taskService.findTaskByTitle(task);

        return result? ResponseMessage.success() : ResponseMessage.error();
    }


    @PostMapping("/addTask")
    @ResponseBody
    public ResponseMessage addProject(@RequestParam String taskName ){

        System.out.println("Receive request /addProject");

        Task task = new Task();
        task.setTitle(taskName);


        String result = taskService.addTask(task);

        if(result.contains("add task successfully!")){
            return ResponseMessage.success();
        }

        return ResponseMessage.error().addObject("Msg",result);
    }


    @PostMapping("/removeTask")
    @ResponseBody
    public ResponseMessage removeTask(@RequestParam String taskName ){

        System.out.println("Receive request /removeTask");

        Task task = new Task();
        task.setTitle(taskName);


        String result = taskService.removeTask(task);

        if(result.contains("remove task successfully!")){
            return ResponseMessage.success();
        }

        return ResponseMessage.error().addObject("Msg",result);
    }
}
