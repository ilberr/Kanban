package com.TD.Kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TD.Kanban.Domain.TaskStatus;

public interface TaskStatusRepository extends JpaRepository<TaskStatus, Long> {

}
