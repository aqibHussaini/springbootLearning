package com.learning.demo.controller;

import com.learning.demo.Entity.Todo;
import com.learning.demo.service.todoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {
    @Autowired
    private todoService todoService;
    // next task is to add log4j in this app
    // todo do junit aop logging security in this project cover all modules
    @GetMapping("/todos/{page}")
    public String getAllTodos(Model model, @PathVariable int page)
    {
        Pageable  pageable=PageRequest.of(page,9);
        model.addAttribute("todos",todoService.fetchAllTodos(pageable));
        model.addAttribute("page",pageable);
        return "home.html";
    }
    @PostMapping("/save")
    public String save(Todo todo, Model model)
    {
        model.addAttribute("message",this.todoService.save(todo).getName()+" got saved");
        return "redirect:/todos";
    }
}
