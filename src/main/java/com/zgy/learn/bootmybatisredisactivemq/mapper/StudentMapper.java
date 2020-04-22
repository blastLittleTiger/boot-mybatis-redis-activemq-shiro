package com.zgy.learn.bootmybatisredisactivemq.mapper;

import com.zgy.learn.bootmybatisredisactivemq.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {
    public List<Student> getAllStudents();

    public Integer addStudent(Student student);

    public Student getStudentById(Integer stId);

    public Integer deleteStudentById(Integer stId);

    public Integer updateStudentById(Student student);

    public Student studentBasicInfo(Integer stId);

    // 返回一个map的类型, 接收一个map的类型
    public Map getStudentByNameGender(Map<String, Object> map);
}
