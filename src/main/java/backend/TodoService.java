package backend;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllToDos() {
        return todoRepository.findAll();
    }

    public Todo createToDo(Todo todo) {
        Todo createdTodo = new Todo(
                UUID.randomUUID().toString(),
                todo.description(),
                todoStatus.OPEN
        );

        return todoRepository.save(createdTodo);
    }
}