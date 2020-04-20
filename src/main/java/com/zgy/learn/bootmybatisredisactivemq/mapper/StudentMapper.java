package com.zgy.learn.bootmybatisredisactivemq.mapper;

import com.zgy.learn.bootmybatisredisactivemq.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    public List<Student> getAllStudents();

    public Integer addStudent(Student student);

    public Student getStudentById(Integer stId);

    public Integer deleteStudentById(Integer stId);

    public Integer updateStudentById(Student student);
}
