package com.lab.common.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.lab.common.constants.AppConstants;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private int status;
    private String error;
    private String message;
    private List<String> details;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = AppConstants.DEFAULT_DATE_TIME_FORMAT)
    private LocalDateTime timestamp;

    public ErrorResponse() {
        this.timestamp = LocalDateTime.now();
    }

    public ErrorResponse(int status, String error, String message) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public ErrorResponse(int status, String error, String message, List<String> details) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.details = details;
        this.timestamp = LocalDateTime.now();
    }

    public static ErrorResponse of(int status, String error, String message) {
        return new ErrorResponse(status, error, message);
    }

    public static ErrorResponse of(int status, String error, String message, List<String> details) {
        return new ErrorResponse(status, error, message, details);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
