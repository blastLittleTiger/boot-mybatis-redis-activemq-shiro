package com.zgy.learn.bootmybatisredisactivemq.service;

import com.zgy.learn.bootmybatisredisactivemq.mapper.ParentsMapper;
import com.zgy.learn.bootmybatisredisactivemq.pojo.Parents;
import com.zgy.learn.bootmybatisredisactivemq.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ParentsService {
    @Autowired(required = false)
    ParentsMapper mapper;

    public Parents getParentsById(Integer parentsId) {
        return mapper.getParentsById(parentsId);
    }

    public int addParents(Map<String, Object> map) {
        return mapper.addParents(map);
    }

    public int deleteParents(Integer parentId) {
        return mapper.deleteParents(parentId);
    }

    public int updateParents(Integer parentsId, String fatherName, String motherName) {
        return mapper.updateParents(parentsId, fatherName, motherName);
    }

    public Parents getParentsByFatherMother(String fatherName, String motherName) {
        return mapper.getParentsByFatherMother(fatherName, motherName);
    }


}
