package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {
    private TodoRepository todoList ;

    public TodoListController(TodoRepository tdrepo){
        this.todoList = tdrepo;
    }

    @PostMapping(path = "/api/todo")
    public TodoEntity add(@RequestBody TodoEntity todo){
        return todoList.save(todo);
    }

    @GetMapping(path = "/api/todo")
    public Iterable<TodoEntity> getList(){
        return todoList.findAll();
    }
}
