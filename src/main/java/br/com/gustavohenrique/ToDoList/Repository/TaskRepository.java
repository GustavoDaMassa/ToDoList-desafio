package br.com.gustavohenrique.ToDoList.Repository;

import br.com.gustavohenrique.ToDoList.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task, Long> {
}
