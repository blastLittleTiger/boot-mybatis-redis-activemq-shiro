package com.zgy.learn.bootmybatisredisactivemq.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zgy.learn.bootmybatisredisactivemq.service.ParentsService;
import com.zgy.learn.bootmybatisredisactivemq.utils.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("parents")
public class ParentsController {
    @Autowired
    ParentsService service;

    @GetMapping("getparents")
    public String getParentsById(Integer parentsId) throws JsonProcessingException {
        return JSONUtil.getJsonFromObject(service.getParentsById(parentsId));
    }

    @PostMapping("add")
    public String addParents(String fatherName, String motherName) throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();
        map.put("fatherName", fatherName);
        map.put("motherName", motherName);
        return JSONUtil.getJsonFromObject(service.addParents(map));

    }

    @PostMapping("delete")
    public String deleteParents(Integer parentId) throws JsonProcessingException {
        return JSONUtil.getJsonFromObject(service.deleteParents(parentId));
    }

    @PostMapping("update")
    public String updateParents(Integer parentsId, String fatherName, String motherName) throws JsonProcessingException {
        return JSONUtil.getJsonFromObject(service.updateParents(parentsId, fatherName, motherName));
    }

    @GetMapping("getbyname")
    public String getParentsByFatherMother(String fatherName, String motherName) throws JsonProcessingException {
        return JSONUtil.getJsonFromObject(service.getParentsByFatherMother(fatherName, motherName));
    }
}