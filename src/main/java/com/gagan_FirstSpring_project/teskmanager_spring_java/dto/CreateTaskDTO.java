package com.gagan_FirstSpring_project.teskmanager_spring_java.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateTaskDTO {
    //Still need to complete it is in process
    String title;
    String description;
    String deadline; // in "yyy-mm-dd" format
}
