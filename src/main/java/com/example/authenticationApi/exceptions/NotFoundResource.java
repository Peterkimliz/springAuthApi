package com.example.authenticationApi.exceptions;

public class NotFoundResource extends RuntimeException{
    public NotFoundResource(String message){
        super(message);
    }

}
