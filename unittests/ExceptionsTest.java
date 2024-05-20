package com.business.test;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExceptionsTest {

    @Test
    public void testHandler() throws Exception {
        // Arrange
        Exceptions exceptions = new Exceptions();
        MockHttpServletRequest request = new MockHttpServletRequest();
        WebRequest webRequest = new ServletWebRequest(request);

        // Act
        String result = exceptions.handler();

        // Assert
        assertEquals("exception", result);
    }

    @Test
    public void testHandlerWithException() throws Exception {
        // Arrange
        Exceptions exceptions = new Exceptions();
        MockHttpServletRequest request = new MockHttpServletRequest();
        WebRequest webRequest = new ServletWebRequest(request);
        Exception exception = new Exception("Test Exception");

        // Act
        String result = exceptions.handler(exception, webRequest);

        // Assert
        assertEquals("exception", result);
    }

    @Test
    public void testHandlerWithNullRequest() throws Exception {
        // Arrange
        Exceptions exceptions = new Exceptions();
        WebRequest webRequest = null;
        Exception exception = new Exception("Test Exception");

        // Act
        String result = exceptions.handler(exception, webRequest);

        // Assert
        assertEquals("exception", result);
    }

    @Test
    public void testHandlerWithNullException() throws Exception {
        // Arrange
        Exceptions exceptions = new Exceptions();
        MockHttpServletRequest request = new MockHttpServletRequest();
        WebRequest webRequest = new ServletWebRequest(request);
        Exception exception = null;

        // Act
        String result = exceptions.handler(exception, webRequest);

        // Assert
        assertEquals("exception", result);
    }
}