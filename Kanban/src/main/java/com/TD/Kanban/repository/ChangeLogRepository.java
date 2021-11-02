package com.TD.Kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TD.Kanban.Domain.ChangeLog;

public interface ChangeLogRepository extends JpaRepository<ChangeLog, Long> {

}