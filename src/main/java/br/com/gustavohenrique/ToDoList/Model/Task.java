package br.com.gustavohenrique.ToDoList.Model;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "tasks")
@Entity
public class  Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private boolean done;
    private int priority;
}
