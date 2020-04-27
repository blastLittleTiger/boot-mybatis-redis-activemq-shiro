package com.zgy.learn.bootmybatisredisactivemq.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zgy.learn.bootmybatisredisactivemq.pojo.Parents;
import com.zgy.learn.bootmybatisredisactivemq.service.ParentsService;
import com.zgy.learn.bootmybatisredisactivemq.service.RedisService;
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

    @Autowired
    private RedisService redisService;

    @GetMapping("getparents")
    public String getParentsById(Integer parentsId) throws JsonProcessingException {
        return JSONUtil.getJsonFromObject(service.getParentsById(parentsId));
    }

    @PostMapping("add")
    public String addParents(String fatherName, String motherName) throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();
        map.put("fatherName", fatherName);
        map.put("motherName", motherName);
        // 添加到缓存之中， 简单使用
        int result = service.addParents(map);
        if (result == 1) {
            Parents p = service.getParentsByFatherMother(fatherName, motherName);
            redisService.set(String.valueOf(p.getParentsId()), p);
            return JSONUtil.getJsonFromObject("添加用户成功，已经添加到缓存之中!");
        } else if (result == 0) {
            return JSONUtil.getJsonFromObject("添加用户失败!");
        } else {
            return JSONUtil.getJsonFromObject("发生错误!");
        }
    }

    @PostMapping("delete")
    public String deleteParents(Integer parentId) throws JsonProcessingException {
        if (redisService.hasKey(String.valueOf(parentId))) {
            // 先删除redis缓存，然后删除数据库值
            redisService.del(String.valueOf(parentId));
            service.deleteParents(parentId);
            return JSONUtil.getJsonFromObject("删除redis缓存, 删除了数据库值!");
        } else {
            service.deleteParents(parentId);
            return JSONUtil.getJsonFromObject("删除了数据库值!");
        }
    }

    @PostMapping("update")
    public String updateParents(Integer parentsId, String fatherName, String motherName) throws JsonProcessingException {
        return JSONUtil.getJsonFromObject(service.updateParents(parentsId, fatherName, motherName));
    }

    @GetMapping("getbyname")
    public String getParentsByFatherMother(String fatherName, String motherName) throws JsonProcessingException {
        return JSONUtil.getJsonFromObject(service.getParentsByFatherMother(fatherName, motherName));
    }

    @GetMapping("kids1")
    public String getParentsKids(Integer parentsId) throws JsonProcessingException {
        return JSONUtil.getJsonFromObject(service.getParentsKids1(parentsId));
    }

    @GetMapping("kids2")
    public String getParentsKidsById2(Integer parentsId) throws JsonProcessingException {
        return JSONUtil.getJsonFromObject(service.getParentsKids2(parentsId));
    }
}