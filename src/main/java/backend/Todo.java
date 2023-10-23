package backend;

public record Todo(
        String id,
        String description,
        todoStatus status
) { }
