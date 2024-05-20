package com.business;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExceptionsTest {

    @Test
    public void testHandler() {
        Exceptions exceptions = new Exceptions();
        String result = exceptions.handler();
        assertEquals("exception", result);
    }

    @Test
    public void testResponseStatus() {
        ResponseStatus responseStatus = Exceptions.class.getAnnotation(ResponseStatus.class);
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, responseStatus.value());
    }

    @Test
    public void testExceptionHandler() {
        ExceptionHandler exceptionHandler = Exceptions.class.getAnnotation(ExceptionHandler.class);
        assertEquals(Exception.class, exceptionHandler.value()[0]);
    }
}