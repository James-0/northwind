package com.example.northwind.exception;

public class ErrorResponse {

    private String message;

    // Default constructor
    public ErrorResponse() {
    }

    // Constructor with a message parameter
    public ErrorResponse(String message) {
        this.message = message;
    }

    // Getter and setter for message
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}