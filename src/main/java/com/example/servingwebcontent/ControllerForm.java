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
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerForm {
    @PostMapping("/form")
    public String form(String personName,String contrasenya,Model model){
        model.addAttribute("Name", personName);
        model.addAttribute("Password", contrasenya);
        return "userInfo";
    }
    @GetMapping("/for")
    public String postForm(String personName,String contrasenya,Model model){
        return "userForm";
    }
}