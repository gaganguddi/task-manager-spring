package com.gagan_FirstSpring_project.teskmanager_spring_java.controllers;


import com.gagan_FirstSpring_project.teskmanager_spring_java.dto.CreateTaskDTO;
import com.gagan_FirstSpring_project.teskmanager_spring_java.entites.TaskEntity;
import com.gagan_FirstSpring_project.teskmanager_spring_java.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TasksController {
    //Still need to complete it is in process
    private final TaskService taskService;

    public TasksController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping("")
    public ResponseEntity<List<TaskEntity>> getTasks(){
        var tasks = taskService.getTasks();

        return ResponseEntity.ok(tasks);
    }

    @GetMapping("{id}")
    public ResponseEntity<TaskEntity> getTaskById(@PathVariable("id") Integer id){
        var task = taskService.getTaskById(id);
        if (task == null){
            return ResponseEntity.notFound().build();
        }

        return  ResponseEntity.ok(task);
    }

    @PostMapping("")
    public ResponseEntity<TaskEntity> addTask(@RequestBody CreateTaskDTO body){
        var task = taskService.addTask(body.getTitle(), body.getDescription(), body.getDeadline());

        return  ResponseEntity.ok(task);
    }

}
