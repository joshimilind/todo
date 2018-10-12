package com.todo.data;

import javax.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "TodoList")
public class TodoEntity {

  @Id
  private String id;

  @NotEmpty
  private String toDo;
}
