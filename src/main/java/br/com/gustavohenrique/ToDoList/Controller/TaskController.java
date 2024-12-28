package br.com.gustavohenrique.ToDoList.Controller;

import br.com.gustavohenrique.ToDoList.Model.Task;
import br.com.gustavohenrique.ToDoList.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
     List<Task> create(@RequestBody Task task){
        return taskService.create(task);
    }
    @GetMapping
     List<Task> showtasks(){
        return taskService.showTasks();
    }

    @PutMapping
    List<Task> update(@RequestBody Task task){
         return  taskService.update(task);
    }
    @DeleteMapping("{id}")
     List<Task> delete(@PathVariable("id") Long id){
        return taskService.delete(id);
    }
}
