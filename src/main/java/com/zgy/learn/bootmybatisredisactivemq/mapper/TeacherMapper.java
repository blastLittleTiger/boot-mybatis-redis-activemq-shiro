package com.zgy.learn.bootmybatisredisactivemq.mapper;

import com.zgy.learn.bootmybatisredisactivemq.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TeacherMapper {
    @Select("select teId, teName, teAge, tePhoneNo, teGender, teClass, teCourse, teWorkTime from teacher where teId = #{teId}")
    public Teacher getTeacherById(Integer teId);

    @Select("select teId, teName, teAge, tePhoneNo, teGender, teClass, teCourse, teWorkTime from teacher")
    public List<Teacher> getAllTeachers();
}
