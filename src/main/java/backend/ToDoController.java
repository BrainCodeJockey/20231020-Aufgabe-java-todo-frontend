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

    @GetMapping("details/{id}")
    public Todo getToDoById(@RequestParam String id) {
        return this.todoService.getToDoById(id);
    }

    @PostMapping
    public Todo createToDo(@RequestBody Todo todo) {
        System.out.println(todo);
        return todoService.createToDo(todo);
    }

    @PutMapping("/{id}")
    public Todo updateToDo(@PathVariable String id, @RequestBody Todo todo) {
        if (!id.equals(todo.id())) {
            throw new IllegalArgumentException("id does not match");
        }
        return todoService.updateToDo(todo);
    }
    @DeleteMapping("/{id}")
    public void deleteToDo(@PathVariable String id) {
        todoService.deleteToDo(id);
    }
}