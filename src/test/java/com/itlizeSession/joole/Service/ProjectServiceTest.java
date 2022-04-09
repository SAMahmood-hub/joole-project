package com.itlizeSession.joole.Service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Entity.User;
import com.itlizeSession.joole.Repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootTest
public class ProjectServiceTest {

    @Autowired
    private ProjectService service;

    @MockBean
    private ProjectRepository repository;

    @Test
    //@Ignore
    public void saveProject(){
        Timestamp t1 = new Timestamp(System.currentTimeMillis());
        Timestamp t2 = new Timestamp(System.currentTimeMillis());
        Project pro = new Project();
        pro.setOwner(new User("Wells123"));
        pro.setTimeCreated(t1);
        pro.setTimeUpdated(t2);

        when(repository.save(pro)).thenReturn(pro);

        assertThat(service.saveProject(pro)).isEqualTo(pro);

    }


    @Test
    public void fetchProjectById(){
        Timestamp t1 = new Timestamp(System.currentTimeMillis());
        Timestamp t2 = new Timestamp(System.currentTimeMillis());
        Project pro = new Project();
        pro.setOwner(new User("Wells123"));
        pro.setTimeCreated(t1);
        pro.setTimeUpdated(t2);

        when(repository.findById(1)).thenReturn(Optional.of(pro));
        assertThat(service.fetchProjectById(1)).isEqualTo(pro);
    }

    @Test
    public void fetchProjectList(){
        Timestamp t1 = new Timestamp(System.currentTimeMillis());
        Timestamp t2 = new Timestamp(System.currentTimeMillis());
        Project pro1 = new Project();
        pro1.setOwner(new User("Wells123"));
        pro1.setTimeCreated(t1);
        pro1.setTimeUpdated(t2);

        Timestamp t3 = new Timestamp(System.currentTimeMillis());
        Timestamp t4 = new Timestamp(System.currentTimeMillis());
        Project pro2 = new Project();
        pro2.setOwner(new User("Wells123"));
        pro2.setTimeCreated(t1);
        pro2.setTimeUpdated(t2);

        List<Project> ticketList = new ArrayList<>();
        ticketList.add(pro1);
        ticketList.add(pro2);

        when(repository.findAll()).thenReturn(ticketList);

        assertThat(service.fetchProjectList()).isEqualTo(ticketList);
    }


    @Test
    public void deleteProjectById(){


        Timestamp t1 = new Timestamp(System.currentTimeMillis());
        Timestamp t2 = new Timestamp(System.currentTimeMillis());
        Project pro = new Project();
        pro.setOwner(new User("Wells123"));
        pro.setTimeCreated(t1);
        pro.setTimeUpdated(t2);
        when(repository.findById((int) pro.getId())).thenReturn(Optional.of(pro));
        service.deleteProjectById(0);
        verify(repository).deleteById((int) pro.getId());
    }


    @Test
    public void updateProjectById(){
        Timestamp t1 = new Timestamp(System.currentTimeMillis());
        Timestamp t2 = new Timestamp(System.currentTimeMillis());
        Project pro = new Project();
        pro.setOwner(new User("Wells123"));
        pro.setTimeCreated(t1);
        pro.setTimeUpdated(t2);

        when(repository.findById(1)).thenReturn(Optional.of(pro));

        pro.setOwner(new User("Wealls123"));
        when(repository.save(pro)).thenReturn(pro);

        assertThat(service.updateProjectById(pro)).isEqualTo(pro);

    }



}
