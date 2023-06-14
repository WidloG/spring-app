package com.example.springapp;



import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
@AutoConfigureMockMvc
class SpringAppApplicationTests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void returnDefaultValue() throws Exception {
    this.mockMvc.perform(get("/"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().string("Jenkin's pipeline"));
  }

}
