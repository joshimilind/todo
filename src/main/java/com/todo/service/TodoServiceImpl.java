package com.todo.service;

import com.todo.data.TodoEntity;
import com.todo.repository.TodoRepo;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

  private Logger logger = LoggerFactory.getLogger(TodoServiceImpl.class);

  @Autowired
  private TodoRepo todoRepo;

  @Override
  public TodoEntity addToList(TodoEntity todoEntity) throws IOException {

    logger.info("added in mongo = " + todoEntity);
    return todoRepo.save(todoEntity);
  }

  @Override
  public List<TodoEntity> getTodoList() throws IOException {
    List<TodoEntity> todoEntityList = todoRepo.findAll();
    return todoEntityList;
  }

}
