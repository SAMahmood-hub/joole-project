package com.itlizeSession.joole.Service;
import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.TechnicalDetail;
import com.itlizeSession.joole.Entity.User;
import com.itlizeSession.joole.Repository.TechnicalDetailRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TechnicalDetailServiceTest {

    @Autowired
    private TechnicalDetailService service;

    @MockBean
    private TechnicalDetailRepository repository;

    @Test
    //@Ignore
    public void saveTechnicalDetail(){
        Product prod = new Product();
        TechnicalDetail tech = new TechnicalDetail(prod, "sample details:1111");

        when(repository.save(tech)).thenReturn(tech);

        assertThat(service.saveTechnicalDetail(tech)).isEqualTo(tech);

    }


    @Test
    public void fetchTechnicalDetailById(){
        Product prod = new Product();
        TechnicalDetail tech = new TechnicalDetail(prod, "sample details:1111");

        when(repository.findById(1)).thenReturn(Optional.of(tech));
        assertThat(service.fetchTechnicalDetailById(1)).isEqualTo(tech);
    }

    @Test
    public void fetchProjectList(){
        Product prod = new Product();
        TechnicalDetail tech1 = new TechnicalDetail(prod, "sample details:1111");
        tech1.setDetails("Wells123");

        Product prod2 = new Product();
        TechnicalDetail tech2 = new TechnicalDetail(prod2, "sample details:1111");
        tech2.setDetails("Wells12223");

        List<TechnicalDetail> ticketList = new ArrayList<>();
        ticketList.add(tech1);
        ticketList.add(tech2);

        when(repository.findAll()).thenReturn(ticketList);

        assertThat(service.fetchTechnicalDetailList()).isEqualTo(ticketList);
    }


    @Test
    public void deleteTechnicalDetailById(){


        Product prod = new Product();
        TechnicalDetail tech1 = new TechnicalDetail(prod, "sample details:1111");
        tech1.setDetails("Wells123");
        when(repository.findById((int) tech1.getId())).thenReturn(Optional.of(tech1));
        service.deleteTechnicalDetailById(0);
        verify(repository).deleteById((int) tech1.getId());
    }


    @Test
    public void updateProjectById(){
        Product prod = new Product();
        TechnicalDetail tech1 = new TechnicalDetail(prod, "sample details:1111");
        tech1.setDetails("Wells123");

        when(repository.findById(1)).thenReturn(Optional.of(tech1));

        tech1.setDetails("Waa12al123");
        when(repository.save(tech1)).thenReturn(tech1);

        assertThat(service.updateTechnicalDetailById(tech1)).isEqualTo(tech1);

    }



}
