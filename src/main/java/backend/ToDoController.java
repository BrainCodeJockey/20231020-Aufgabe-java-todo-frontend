package backend;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {
    private final TodoService todoService;

    public ToDoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getAllToDo() {
        return this.todoService.getAllToDos();
    }

    @PostMapping
    public Todo createToDo(@RequestBody Todo todo) {
        System.out.println(todo);
        return todoService.createToDo(todo);
    }
}