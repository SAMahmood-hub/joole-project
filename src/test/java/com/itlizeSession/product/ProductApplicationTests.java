package com.itlizeSession.product;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.test.context.junit4.SpringRunner;

@EnableJpaAuditing
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTests {

	@Test
	public void contextLoads() {
	}

}
