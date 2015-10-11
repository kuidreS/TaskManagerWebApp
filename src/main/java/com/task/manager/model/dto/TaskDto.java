package com.task.manager.model.dto;

/**
 * Created by Vitalii on 23.09.2015.
 */
public class TaskDto {

    private String name;
    private String description;
    private String priority;
    private String status;

    public TaskDto() {

    }

    public TaskDto(String name, String description, String priority, String status) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
