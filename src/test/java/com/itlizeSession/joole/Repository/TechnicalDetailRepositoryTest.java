package com.itlizeSession.joole.Repository;



import com.itlizeSession.joole.Repository.TechnicalDetailRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.itlizeSession.joole.Entity.TechnicalDetail;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TechnicalDetailRepositoryTest {
    @Autowired
    private TechnicalDetailRepository repository;
    @Test
    public void test() {
        TechnicalDetail tec = new TechnicalDetail("Flying on sky");

        repository.save(tec);

        Assertions.assertThat(tec.getId()).isGreaterThan(0);
    }

}