package me.dohi.dohiblog.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

public class HomeController {

    @GetMapping("/")
    public String thymeleafExample(Model model) {


        return "/Calender";
    }





}
