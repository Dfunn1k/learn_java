package com.codigo.api_rest_g7.ejercicio6.controller;

import com.codigo.api_rest_g7.ejercicio6.exception.TaskNotFoundException;
import com.codigo.api_rest_g7.ejercicio6.model.TaskModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    HashMap<Integer, TaskModel> tasksMap = new HashMap<>();

    @GetMapping()
    public List<TaskModel> getTasks(){
        return new ArrayList<>(tasksMap.values());
    }

    @GetMapping("/{id}")
    public TaskModel getTaskById(@PathVariable int id) {
        TaskModel task = tasksMap.get(id);

        if (task != null)
            return task;
        else
            throw new TaskNotFoundException();
    }

    @PostMapping("/add")
    public TaskModel addTask(@RequestBody TaskModel task) {
        tasksMap.put(task.getNumTask(), task);
        return task;
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteTask(@PathVariable int id) {
        TaskModel flag = tasksMap.remove(id);

        if (flag == null)
            throw new TaskNotFoundException();
        else
            return "La tarea con el ID:" + id + " se eliminó correctamente";
    }

    @PutMapping("/update/{id}")
    public TaskModel updateTask(@PathVariable int id,
                                @RequestBody String name){
        TaskModel taskUpdated = tasksMap.get(id);
        if (taskUpdated != null){
            taskUpdated.setNameTask(name);
            return taskUpdated;
        }
        else
            throw new TaskNotFoundException();
    }
}
