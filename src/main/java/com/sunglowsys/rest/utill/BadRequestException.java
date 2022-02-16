package com.sunglowsys.rest.utill;

public class BadRequestException  extends RuntimeException{
    public BadRequestException (String message){
        super(message);
    }
}
