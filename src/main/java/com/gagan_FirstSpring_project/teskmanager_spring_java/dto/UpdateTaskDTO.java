package com.gagan_FirstSpring_project.teskmanager_spring_java.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateTaskDTO {

    String description;
    String deadline;
    Boolean completed;
}
