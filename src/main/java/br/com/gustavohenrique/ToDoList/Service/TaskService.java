package br.com.gustavohenrique.ToDoList.Service;

import br.com.gustavohenrique.ToDoList.Model.Task;
import br.com.gustavohenrique.ToDoList.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> create(Task task){
        taskRepository.save(task);
        return showTasks();
    }

    public List<Task> showTasks() {

       Sort sorted = Sort.by("priority").descending().and(Sort.by("name").ascending());
        return taskRepository.findAll(sorted);
    }

    public List<Task> update(Task task){
        taskRepository.save(task);
        return showTasks();
    }

    public List<Task> delete(Long id) {
        taskRepository.deleteById(id);
        return showTasks();
    }
}
