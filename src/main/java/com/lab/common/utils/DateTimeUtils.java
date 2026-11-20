package com.lab.common.utils;

import com.lab.common.constants.AppConstants;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public final class DateTimeUtils {

    private DateTimeUtils() {
        // Prevent instantiation
    }

    private static final DateTimeFormatter DEFAULT_DATE_TIME_FORMATTER =
            DateTimeFormatter.ofPattern(AppConstants.DEFAULT_DATE_TIME_FORMAT);

    private static final DateTimeFormatter DEFAULT_DATE_FORMATTER =
            DateTimeFormatter.ofPattern(AppConstants.DEFAULT_DATE_FORMAT);

    public static String formatDateTime(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return dateTime.format(DEFAULT_DATE_TIME_FORMATTER);
    }

    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        if (dateTime == null) {
            return null;
        }
        Objects.requireNonNull(pattern, "pattern must not be null");
        return dateTime.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static LocalDateTime parseDateTime(String dateTimeStr) {
        if (StringUtils.isEmpty(dateTimeStr)) {
            return null;
        }
        return LocalDateTime.parse(dateTimeStr, DEFAULT_DATE_TIME_FORMATTER);
    }

    public static String formatDate(LocalDate date) {
        if (date == null) {
            return null;
        }
        return date.format(DEFAULT_DATE_FORMATTER);
    }

    public static LocalDate parseDate(String dateStr) {
        if (StringUtils.isEmpty(dateStr)) {
            return null;
        }
        return LocalDate.parse(dateStr, DEFAULT_DATE_FORMATTER);
    }
}
