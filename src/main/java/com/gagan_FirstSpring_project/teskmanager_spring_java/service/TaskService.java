package com.gagan_FirstSpring_project.teskmanager_spring_java.service;

import com.gagan_FirstSpring_project.teskmanager_spring_java.entites.TaskEntity;
import lombok.Getter;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class TaskService {
//Still need to complete it is in process

    private ArrayList<TaskEntity> tasks = new ArrayList<>();
    private int taskId = 1;

   public TaskEntity addTask(String title, String description, String deadline){
        TaskEntity task = new TaskEntity();
        task.setId(taskId);
        task.setTitle(title);
        task.setDescription(description);
      //  task.setDeadline(new Date(deadline)); //TODO: Validate date formate YYY-MM-DD
        task.setCompleted(false);
        tasks.add(task);
        taskId++;
        return  task;
    }

    public TaskEntity getTaskById(int id){
        for (TaskEntity task : tasks){
            if (task.getId() == id){
                return task;
            }
        }
        return  null;
    }

    public List<TaskEntity> getTasks(){
       return tasks;
    }



}
