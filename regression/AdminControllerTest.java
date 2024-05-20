package com.business.controllers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import com.business.entities.Admin;
import com.business.entities.Orders;
import com.business.entities.Product;
import com.business.entities.User;
import com.business.loginCredentials.AdminLogin;
import com.business.loginCredentials.UserLogin;
import com.business.services.AdminServices;
import com.business.services.OrderServices;
import com.business.services.ProductServices;
import com.business.services.UserServices;

@SpringBootTest
public class AdminControllerTest {

	@Autowired
	private AdminController adminController;

	@MockBean
	private UserServices userServices;

	@MockBean
	private AdminServices adminServices;

	@MockBean
	private ProductServices productServices;

	@MockBean
	private OrderServices orderServices;

	@Test
	public void testAdminLogin() {
		AdminLogin login = new AdminLogin();
		login.setEmail("admin@test.com");
		login.setPassword("password");
		String view = adminController.getAllData(login, null);
		assertEquals("redirect:/admin/services", view);
	}

	@Test
	public void testUserLogin() {
		UserLogin login = new UserLogin();
		login.setUserEmail("user@test.com");
		login.setUserPassword("password");
		String view = adminController.userLogin(login, null);
		assertEquals("BuyProduct", view);
	}

	@Test
	public void testSearchHandler() {
		String view = adminController.seachHandler("product", null);
		assertEquals("BuyProduct", view);
	}

	@Test
	public void testReturnBack() {
		String view = adminController.returnBack(null);
		assertEquals("Admin_Page", view);
	}

	@Test
	public void testAddAdmin() {
		String view = adminController.addAdminPage();
		assertEquals("Add_Admin", view);
	}

	@Test
	public void testUpdateAdmin() {
		String view = adminController.update(1, null);
		assertEquals("Update_Admin", view);
	}

	@Test
	public void testDeleteAdmin() {
		String view = adminController.deleteAdmin(1);
		assertEquals("redirect:/admin/services", view);
	}

	@Test
	public void testAddProduct() {
		String view = adminController.addProduct();
		assertEquals("Add_Product", view);
	}

	@Test
	public void testUpdateProduct() {
		String view = adminController.updateProduct(1, null);
		assertEquals("Update_Product", view);
	}

	@Test
	public void testAddUser() {
		String view = adminController.addUser();
		assertEquals("Add_User", view);
	}

	@Test
	public void testUpdateUserPage() {
		String view = adminController.updateUserPage(1, null);
		assertEquals("Update_User", view);
	}

	@Test
	public void testOrderHandler() {
		Orders order = new Orders();
		order.setoPrice(100);
		order.setoQuantity(2);
		String view = adminController.orderHandler(order, null);
		assertEquals("Order_success", view);
	}

	@Test
	public void testBack() {
		String view = adminController.back(null);
		assertEquals("BuyProduct", view);
	}
}