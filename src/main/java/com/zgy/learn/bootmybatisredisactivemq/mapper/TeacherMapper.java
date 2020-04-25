package com.zgy.learn.bootmybatisredisactivemq.mapper;

import com.zgy.learn.bootmybatisredisactivemq.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface TeacherMapper {
    @Select("select teId, teName, teAge, tePhoneNo, teGender, teClass, teCourse, teWorkTime from teacher where teId = #{teId}")
    public Teacher getTeacherById(Integer teId);

    @Select("select teId, teName, teAge, tePhoneNo, teGender, teClass, teCourse, teWorkTime from teacher")
    public List<Teacher> getAllTeachers();

    // jdbctype和javatype的位置放哪儿
    @Select("select teId, teName, teAge, tePhoneNo, teGender, teClass, teCourse, teWorkTime from teacher where teName = #{teName} and teGender = #{teGender}")
    @Results(value = {
            @Result(property = "teId", column = "teId"),
            @Result(property = "teName", column = "teName"),
            @Result(property = "teClass", column = "teClass"),
            @Result(property = "teCourse", column = "teCourse")
    })
    public Teacher getTeacherByNameAndGender(Map<String, Object> map);
}
