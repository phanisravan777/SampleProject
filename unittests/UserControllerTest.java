package com.business.controllers.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import com.business.entities.User;
import com.business.services.UserServices;

public class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock
    private UserServices userServices;

    @Mock
    private Model model;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddUser() {
        User user = new User();
        when(userServices.addUser(user)).thenReturn(user);
        String view = userController.addUser(user);
        verify(userServices).addUser(user);
        assertEquals("redirect:/admin/services", view);
    }

    @Test
    public void testUpdateUser() {
        User user = new User();
        int id = 1;
        when(userServices.updateUser(user, id)).thenReturn(user);
        String view = userController.updateUser(user, id);
        verify(userServices).updateUser(user, id);
        assertEquals("redirect:/admin/services", view);
    }

    @Test
    public void testDeleteUser() {
        int id = 1;
        String view = userController.deleteUser(id);
        verify(userServices).deleteUser(id);
        assertEquals("redirect:/admin/services", view);
    }

}