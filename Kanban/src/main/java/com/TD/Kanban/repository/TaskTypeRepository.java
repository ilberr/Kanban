package com.TD.Kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TD.Kanban.Domain.TaskType;

public interface TaskTypeRepository extends JpaRepository<TaskType, Long> {

}

