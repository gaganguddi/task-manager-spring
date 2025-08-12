package com.gagan_FirstSpring_project.teskmanager_spring_java.entites;


import lombok.Data;
import java.util.Date;

@Data
public class TaskEntity {
    //Still need to complete it is in process
    private int id;
    private  String title;
    private  String  description;
    private  Date deadline;
    private  boolean completed;
}
