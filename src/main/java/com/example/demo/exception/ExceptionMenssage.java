package com.example.demo.exception;

import com.fasterxml.jackson.annotation.JsonInclude;

public class ExceptionMenssage<T> {


    private String mensage;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T body;

    public String getMensage() {
        return mensage;
    }

    public void setMensage(String mensage) {
        this.mensage = mensage;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public ExceptionMenssage(String mensage, T body) {
        super();
        this.mensage = mensage;
        this.body = body;
    }

    public ExceptionMenssage() {
        super();
    }
}
