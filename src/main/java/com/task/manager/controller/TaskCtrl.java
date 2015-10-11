package com.task.manager.controller;

import com.task.manager.model.dto.TaskDto;
import com.task.manager.model.entity.Task;
import com.task.manager.model.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Vitalii on 23.09.2015.
 */
@RestController
public class TaskCtrl {

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value = "/addTask", method = RequestMethod.POST)
    public void createTask (@RequestBody TaskDto taskDto) {
        Task task = new Task();
        task.setName(taskDto.getName());
        task.setDescription(taskDto.getDescription());
        task.setPriority(taskDto.getPriority());
        task.setStatus(taskDto.getStatus());
        task.setDate(new Date());
        taskRepository.save(task);
    }

    @RequestMapping(value = "/getAllTasks", method = RequestMethod.GET)
    public List<Task> getAllTasks() {
        List<Task> taskList = ((List<Task>)taskRepository.findAll());
        return  taskList;
    }
}
