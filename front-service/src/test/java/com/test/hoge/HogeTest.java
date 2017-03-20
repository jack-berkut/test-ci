package com.test.hoge;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = Application.class)
public class HogeTest {
	@Autowired
    private TestRestTemplate restTemplate;
	
	@Test
	public void sampleCase() throws Exception {
		String actual = restTemplate.getForObject("/hoge/", String.class);
		assertThat(actual, is("ainai"));
	}
	
}
