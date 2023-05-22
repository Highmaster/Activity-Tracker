package com.trackingappwk8.services;

import com.trackingappwk8.models.TodoItem;
import com.trackingappwk8.repositories.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public interface TodoItemService {


    Iterable<TodoItem> getAll();

    Optional<TodoItem> getById(Long id);

    TodoItem save(TodoItem todoItem);


     void delete(TodoItem todoItem);

}
