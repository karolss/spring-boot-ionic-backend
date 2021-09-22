package com.example.cursomc.services.exceptions;

public class FileException extends RuntimeException{
    private static final long serialVersionUID = 1l;

    public FileException(String msg){
        super(msg);
    }

    public FileException(String msg, Throwable cause){
        super(msg, cause);
    }

}
