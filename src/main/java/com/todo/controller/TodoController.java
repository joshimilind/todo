package com.todo.controller;

import com.todo.data.TodoEntity;
import com.todo.service.TodoServiceImpl;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todoThis")
public class TodoController {

  private Logger logger = LoggerFactory.getLogger(TodoController.class);

  @Autowired
  private TodoServiceImpl todoService;

  @PostMapping
  public String doThis(@RequestBody TodoEntity todoEntity) throws IOException {

    logger.info("in controller ");

    todoService.addToList(todoEntity);
    return "added to list";
  }

  @GetMapping("/")
  public List<TodoEntity> getTodo(TodoEntity todoEntity) throws IOException {

    return todoService.getTodoList();
  }
}
