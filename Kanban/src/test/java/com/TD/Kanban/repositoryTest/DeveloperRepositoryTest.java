package com.TD.Kanban.repositoryTest;

import java.util.List;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.util.Assert;

import com.TD.Kanban.Domain.*;

import com.TD.Kanban.repository.DeveloperRepository;


@DataJpaTest
@AutoConfigureTestDatabase()
public class DeveloperRepositoryTest {

 
    @Autowired
    private DeveloperRepository repo;
    @Test
    public void testlistDevelopers() {
        List<Developer> developers = (List<Developer>) repo.findAll();
        assertThat((developers).size(, isGreaterThan(0));
    }
	
	
	}

}
