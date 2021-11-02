package com.TD.Kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TD.Kanban.Domain.Developer;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {

}
