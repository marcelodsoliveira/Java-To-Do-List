package br.com.marcelodsoliveira.todolist.task;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public class ITaskRepository extends JpaRepository<TaskModel, UUID> {
  
}
