package com.TD.Kanban;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.TD.Kanban.repository.*;
import com.TD.Kanban.Domain.*;

@SpringBootApplication
public class KanbanApplication {

	public static void main(String[] args) {
		SpringApplication.run(KanbanApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner LoadDB(DeveloperRepository DeveloperRepository, TaskRepository TaskRepository, TaskStatusRepository TaskStatusRepository, TaskTypeRepository TaskTypeRepository, ChangeLogRepository ChangeLogRepository ) {
        return (args) -> {

        	// create tasks
			TaskRepository.save(new Task(null, "Créer une base de donnée", null, null, null, null, null));
			TaskRepository.save(new Task(null, "Développer le backend d'une application de gestion de tâches ", null, null, null, null, null));
			
			// create developers
			DeveloperRepository.save(new Developer(null, "ilham","Ben-nar", null, null, null));
			DeveloperRepository.save(new Developer(null, "Rita","Akesbi", null, null, null));

		
			// fetch all Developers
			System.out.println("Developers found with findAll():");
			System.out.println("---------------------------");
			for (Developer Developer : DeveloperRepository.findAll()) {
				System.out.println(Developer.toString());
			}
			System.out.println();

		};
    }
}

