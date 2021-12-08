package fr.lernejo.todo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("todo")
public class TodoEntity {
    @Id
    private Long id;
    private String message;
    private String author;
}
