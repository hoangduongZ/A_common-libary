package com.lab.common.response;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApiResponseTest {

    @Test
    void testSuccessWithData() {
        ApiResponse<String> response = ApiResponse.success("test-data");
        assertTrue(response.isSuccess());
        assertEquals("test-data", response.getData());
        assertNotNull(response.getTimestamp());
    }

    @Test
    void testSuccessWithMessageAndData() {
        ApiResponse<Integer> response = ApiResponse.success("Item created", 100);
        assertTrue(response.isSuccess());
        assertEquals("Item created", response.getMessage());
        assertEquals(100, response.getData());
        assertNotNull(response.getTimestamp());
    }

    @Test
    void testError() {
        ApiResponse<Void> response = ApiResponse.error("Something went wrong");
        assertFalse(response.isSuccess());
        assertEquals("Something went wrong", response.getMessage());
        assertNull(response.getData());
        assertNotNull(response.getTimestamp());
    }
}
