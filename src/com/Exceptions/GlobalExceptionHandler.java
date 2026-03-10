package com.Exceptions;

public class GlobalExceptionHandler {

    public static ErrorResponse handle(Exception ex) {
        if (ex instanceof ResourceNotFoundException) {
            return new ErrorResponse(ex.getMessage(), 404);
        } else if (ex instanceof BadRequestException) {
            return new ErrorResponse(ex.getMessage(), 400);
        } else {
            return new ErrorResponse("Something went wrong", 500);
        }
    }
}