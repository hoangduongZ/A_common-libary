package com.lab.common.utils;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeUtilsTest {

    @Test
    void testFormatAndParseDateTime() {
        LocalDateTime now = LocalDateTime.of(2026, 11, 20, 10, 30, 45);
        String formatted = DateTimeUtils.formatDateTime(now);
        assertEquals("2026-11-20 10:30:45", formatted);

        LocalDateTime parsed = DateTimeUtils.parseDateTime(formatted);
        assertEquals(now, parsed);
    }

    @Test
    void testFormatAndParseDate() {
        LocalDate date = LocalDate.of(2026, 11, 20);
        String formatted = DateTimeUtils.formatDate(date);
        assertEquals("2026-11-20", formatted);

        LocalDate parsed = DateTimeUtils.parseDate(formatted);
        assertEquals(date, parsed);
    }

    @Test
    void testNullHandling() {
        assertNull(DateTimeUtils.formatDateTime(null));
        assertNull(DateTimeUtils.formatDate(null));
        assertNull(DateTimeUtils.parseDateTime(null));
        assertNull(DateTimeUtils.parseDate(null));
    }
}
