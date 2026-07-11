package com.jerry.findfiles.Controller;


import com.jerry.findfiles.Service.impl.serviceImpl;
import com.jerry.findfiles.Service.service;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class ControllerImpl {

    @Autowired
    private service Service;

//    private service Service;
//    @Autowired
//    public ControllerImpl(service Service){
//        this.Service=Service;
//    }


    @RequestMapping("/find")
    @GetMapping
    public HashMap<String,Integer> find(
            @RequestParam String path){
//        String path=request.getParameter("path");
//        File file=new File(path);
//        return findFile(file);
            return Service.findFile(new File(path));
    }
}
