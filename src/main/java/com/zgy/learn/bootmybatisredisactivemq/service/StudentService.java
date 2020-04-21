package com.zgy.learn.bootmybatisredisactivemq.service;

import com.zgy.learn.bootmybatisredisactivemq.mapper.StudentMapper;
import com.zgy.learn.bootmybatisredisactivemq.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: renjiaxin
 * @Despcription:
 * @Date: Created in 2020/4/21 1:03
 * @Modified by:
 */
@Service
public class StudentService {
    @Autowired(required = false)
    StudentMapper mapper;

    public Student getStudentById(Integer stId) {
        return mapper.getStudentById(stId);
    }

    public List<Student> getAllStudents() {
        return mapper.getAllStudents();
    }

    public Student addStudent(Student student){
        mapper.addStudent(student);
        return student;
    }

    public Integer deleteStudentById(Integer stId){
        return mapper.deleteStudentById(stId);
    }

    public Integer updateStudentById(Student student){
        return mapper.updateStudentById(student);

    }

    // 目的是为了返回部分的信息
    public Student studentBasicInfo(Integer stId) {
        Student student = mapper.studentBasicInfo(stId);
//        Map<String, Object> map = new HashMap<>();
//        map.put("stId", student.getStId());
//        map.put("stAge",student.getStAge());
//        map.put("stGender",student.getStGender());
//        map.put("stClass",student.getStClass());
        return student;
    }
}
