package com.zgy.learn.bootmybatisredisactivemq.service;

import com.zgy.learn.bootmybatisredisactivemq.mapper.StudentMapper;
import com.zgy.learn.bootmybatisredisactivemq.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: renjiaxin
 * @Despcription:
 * @Date: Created in 2020/4/21 1:03
 * @Modified by:
 */
@Service
public class StudentService {
    @Autowired
    StudentMapper mapper;

    public Student getStudentById(Integer stId) {
        return mapper.getStudentById(stId);
    }

    public List<Student> getAllStudents() {
        return mapper.getAllStudents();
    }
}
