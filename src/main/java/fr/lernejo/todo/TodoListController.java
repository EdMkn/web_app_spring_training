package fr.lernejo.todo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoListController {
    private ArrayList<Todo> todoList = new ArrayList<Todo>();


    @PostMapping(path = "/api/todo")
    public void addTodo(@RequestBody Todo todo){
        todoList.add(todo);
    }

    @GetMapping(path = "/api/todo")
    public ResponseEntity<ArrayList<Todo>> getTodoList(){
        return  new ResponseEntity<>(todoList, HttpStatus.OK);
    }
}
