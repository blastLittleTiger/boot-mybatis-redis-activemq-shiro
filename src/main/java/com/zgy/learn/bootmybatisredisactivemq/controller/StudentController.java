package com.zgy.learn.bootmybatisredisactivemq.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zgy.learn.bootmybatisredisactivemq.pojo.Student;
import com.zgy.learn.bootmybatisredisactivemq.service.StudentService;
import com.zgy.learn.bootmybatisredisactivemq.utils.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: renjiaxin
 * @Despcription:
 * @Date: Created in 2020/4/21 1:01
 * @Modified by:
 */
@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService service;

    @RequestMapping("getonestudent")
    @ResponseBody
    public String getonestudent(Integer stId) throws JsonProcessingException {
        return JSONUtil.getJsonFromObject(service.getStudentById(stId));
    }

    @RequestMapping("getallstudent")
    @ResponseBody
    public String getallstudent() throws JsonProcessingException {
        return JSONUtil.getJsonFromObject(service.getAllStudents());
    }

    @RequestMapping(value = "addstudent", method = RequestMethod.POST)
    @ResponseBody
    public String addstudent(Student student) throws JsonProcessingException {
        return JSONUtil.getJsonFromObject(service.addStudent(student));
    }
}
