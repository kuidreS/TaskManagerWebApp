package com.task.manager.model.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by Vitalii on 17.09.2015.
 */
@Entity
@Table(name = "task")
public class Task{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(max = 256)
    @Column(name = "name", length = 256, nullable = false)
    private String name;

    @Size(max = 256)
    @Column(name = "description", length = 256, nullable = true)
    private String description;

    @Size(max = 256)
    @Column(name = "priority", length = 256, nullable = false)
    private String priority;

    @Size(max = 256)
    @Column(name = "status", length = 256, nullable = false)
    private String status;

    @Column(name = "date", nullable = false, insertable = true, updatable = true)
    private Date date;

    public Task() {

    }

    public Task(String name, String description, String priority, String status, Date date) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", description = '" + description + '\'' +
                ", priority = '" + priority + '\'' +
                ", status = '" + status + '\'' +
                ", date = " + date +
                '}';
    }
}
