package com.todo.service;

import com.todo.data.TodoEntity;
import java.io.IOException;
import java.util.List;

public interface TodoService {

  TodoEntity addToList(TodoEntity todoEntity) throws IOException;

  List<TodoEntity> getTodoList() throws IOException;

}
