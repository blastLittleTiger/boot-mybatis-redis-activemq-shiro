package com.zgy.learn.bootmybatisredisactivemq.service;

import com.zgy.learn.bootmybatisredisactivemq.mapper.TeacherMapper;
import com.zgy.learn.bootmybatisredisactivemq.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: renjiaxin
 * @Despcription:
 * @Date: Created in 2020/4/25 16:52
 * @Modified by:
 */
@Service
public class TeacherService {
    @Autowired(required = false)
    TeacherMapper mapper;

    public Teacher getTeacherById(Integer teId) {
        return mapper.getTeacherById(teId);
    }

    public List<Teacher> getAllTeachers() {
        return mapper.getAllTeachers();
    }

    public  Teacher getTeacherByNameAndGender(Map<String, Object> map){
        return  mapper.getTeacherByNameAndGender(map);
    }

}
