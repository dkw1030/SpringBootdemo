package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class demoService {

    public List<Integer> getList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        return list;
    }
}
