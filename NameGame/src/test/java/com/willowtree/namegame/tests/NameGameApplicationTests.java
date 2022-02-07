package com.willowtree.namegame.tests;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.web.servlet.MockMvc;



@WebMvcTest
@AutoConfigureMockMvc
@SpringBootTest
class NameGameApplicationTests {

	private MockMvc mockMvc; 


	@Test
	void contextLoads() {
	}

	
	@Test
	void expectok_withGet()
	{
		
	}
}
