package com.zgy.learn.bootmybatisredisactivemq.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zgy.learn.bootmybatisredisactivemq.service.TeacherService;
import com.zgy.learn.bootmybatisredisactivemq.utils.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: renjiaxin
 * @Despcription:
 * @Date: Created in 2020/4/21 1:01
 * @Modified by:
 */
@Slf4j
@RestController
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    private TeacherService service;

    @RequestMapping("getoneteacher")
    @ResponseBody
    public String getoneteacher(Integer teId) throws JsonProcessingException {
        return JSONUtil.getJsonFromObject(service.getTeacherById(teId));
    }

    @RequestMapping("getallteacher")
    @ResponseBody
    public String getallteacher() throws JsonProcessingException {
        return JSONUtil.getJsonFromObject(service.getAllTeachers());
    }
}
