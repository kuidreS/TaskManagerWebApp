package com.task.manager.model.repository;

import com.task.manager.model.entity.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Vitalii on 17.09.2015.
 */
public interface TaskRepository extends CrudRepository<Task, Integer> {

    Task findByName(String name);

    List<Task> findByStatus(String status);

    List<Task> findByPriority(String priority);

}
