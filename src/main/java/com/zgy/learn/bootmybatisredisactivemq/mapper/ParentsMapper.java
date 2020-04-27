package com.zgy.learn.bootmybatisredisactivemq.mapper;

import com.zgy.learn.bootmybatisredisactivemq.pojo.Parents;
import com.zgy.learn.bootmybatisredisactivemq.pojo.Student;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;
import java.util.Map;

@Mapper
public interface ParentsMapper {
    @Select("select parentsId, fatherName, motherName from parents where parentsId = #{parentsId}")
    @Results({
            @Result(column = "parentsId", property = "parentsId"),
            @Result(column = "fatherName", property = "fatherName"),
            @Result(column = "motherName", property = "motherName")
    })
    Parents getParentsById(Integer parentsId);

    /**
     * 增删改，返回的都是受影响的行数，只有查返回的是需要的数据
     */
    List<Student> getParentsKids2(Integer parentId);

    int addParents(Map<String, Object> map);

    int deleteParents(Integer parentId);

    int updateParents(Integer parentsId, String fatherName, String motherName);

    Parents getParentsByFatherMother(String fatherName, String motherName);
}
