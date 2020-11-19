package uk.ac.qub.agile.service;

import org.springframework.beans.factory.annotation.Autowired;
import uk.ac.qub.agile.dao.TaskMapper;
import uk.ac.qub.agile.entry.Task;
import uk.ac.qub.agile.entry.TaskExample;

import java.util.List;

public class TaskService {
    @Autowired
    private TaskMapper taskMapper;
    public boolean findTaskByTitle(Task task){
        TaskExample te = new TaskExample();
        te.createCriteria().andTitleEqualTo(task.getTitle());

        List<Task> taskList = taskMapper.selectByExample(te);

        return taskList != null && taskList.size() == 1;
    }

    public String addTask(Task task){
        TaskExample te = new TaskExample();
        te.createCriteria().andTitleEqualTo(task.getTitle());

        List<Task> taskList = taskMapper.selectByExample(te);

        if(taskList != null && taskList.size()>0){
            return "this task has already been created, please try another one ";
        }

        taskMapper.insertSelective(task);

        return "add task successfully!";
    }

    public String removeTask(Task task){
        TaskExample te = new TaskExample();
        te.createCriteria().andTitleEqualTo(task.getTitle());

        List<Task> taskList = taskMapper.selectByExample(te);

        if(taskList != null && taskList.size()>0){
            taskMapper.deleteByExample(te);
            return "task delete successfully ";
        }

        return "no such task!";
    }
}
