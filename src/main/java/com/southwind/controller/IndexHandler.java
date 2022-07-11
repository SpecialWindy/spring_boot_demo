package com.southwind.controller;

import com.southwind.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/index")
public class IndexHandler {
    @GetMapping("/index")
    public String index(Model model){
        System.out.println("index...");
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L,"张三",22));
        list.add(new Student(2L,"李四",23));
        list.add(new Student(3L,"王五",24));
        model.addAttribute("list",list);
        return "index";
    }
}
