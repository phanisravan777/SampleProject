package com.business.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
public class UserControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @MockBean
    private UserServices services;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testAddUser() throws Exception {
        User user = new User();
        mockMvc.perform(post("/addingUser").flashAttr("user", user))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/admin/services"));
    }

    @Test
    public void testUpdateUser() throws Exception {
        User user = new User();
        int id = 1;
        mockMvc.perform(get("/updatingUser/" + id).flashAttr("user", user))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/admin/services"));
    }

    @Test
    public void testDeleteUser() throws Exception {
        int id = 1;
        mockMvc.perform(get("/deleteUser/" + id))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/admin/services"));
    }

}