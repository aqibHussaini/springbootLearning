package com.learning.demo.service;

import com.learning.demo.Entity.Todo;
import com.learning.demo.Entity.todoDTO;
import com.learning.demo.repository.todoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class todoService {
    @Autowired
    private todoRepository todoRepository;

    public Page<Todo> fetchAllTodos(Pageable page) {
        // this.todoRepository.findAll(page).get().map(todoDTO::new).collect(Collectors.toList())
        return this.todoRepository.findAll(page);
    }
    public Todo save(Todo todo)
    {
       return this.todoRepository.save(todo);
    }
}
