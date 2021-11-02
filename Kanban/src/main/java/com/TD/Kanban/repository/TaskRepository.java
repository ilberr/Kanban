package com.TD.Kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TD.Kanban.Domain.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {



}