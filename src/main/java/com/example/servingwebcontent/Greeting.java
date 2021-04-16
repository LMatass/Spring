package com.example.servingwebcontent;

//************************************************************************
//
//  Made by        Lluc Matas
//  Date           16/04/2021
//  Package        com.example.servingwebcontent
//  GitHub:        https://github.com/LMatass     
//  Description:
// 
//************************************************************************
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
