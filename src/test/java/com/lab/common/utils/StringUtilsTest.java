package com.lab.common.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("hello"));
    }

    @Test
    void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank("   "));
        assertFalse(StringUtils.isBlank("  abc  "));
    }

    @Test
    void testDefaultIfBlank() {
        assertEquals("default", StringUtils.defaultIfBlank(null, "default"));
        assertEquals("default", StringUtils.defaultIfBlank("   ", "default"));
        assertEquals("value", StringUtils.defaultIfBlank("value", "default"));
    }
}
