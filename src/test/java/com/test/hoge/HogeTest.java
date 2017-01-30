package com.test.hoge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.test.Application;

@RunWith(SpringRunner.class)
@WebMvcTest(Application.class)
public class HogeTest {
	@Autowired
    private MockMvc mockMvc;
	
	@Test
	public void sampleCase() {
		System.out.println("hoge");
	}
	
}
