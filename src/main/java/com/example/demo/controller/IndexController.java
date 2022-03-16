package com.example.demo.controller;

import com.example.demo.mapper.testMapper;
import com.example.demo.pojo.TestIndex;
import com.example.demo.service.demoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    DataSource dataSource;

    @Autowired
    private testMapper mapper;

    @Autowired
    private demoService demoService;

    @RequestMapping("/test")
    public String index() {
        return "index";
    }

    @RequestMapping("/data")
    public String data(Model model) {
        List<Integer> list = demoService.getList();
        model.addAttribute("data",list);
        return "/data/data";
    }



    @RequestMapping("/database")
    public String dataBase(Model model) throws SQLException {
        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection());

        return "index";
    }


    @RequestMapping("/queryData")
    public String queryData(Model model){
        List<TestIndex> list = mapper.queryData();
        System.out.println(list.size());
        model.addAttribute("data", list);
        return "data/queryData";
    }

    @RequestMapping("/findData")
    public String findData(Model model){
        List<TestIndex> list = mapper.findData(1);
        System.out.println(list.size());
        model.addAttribute("data", list);
        return "data/queryData";
    }
}
