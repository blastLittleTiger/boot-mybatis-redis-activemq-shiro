package com.zgy.learn.bootmybatisredisactivemq.service;

import com.zgy.learn.bootmybatisredisactivemq.mapper.CityMapper;
import com.zgy.learn.bootmybatisredisactivemq.pojo.Souvenir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: renjiaxin
 * @Despcription:
 * @Date: Created in 2020/4/26 23:34
 * @Modified by:
 */
@Service
public class CityService {
    @Autowired(required = false)
    CityMapper mapper;

    public List<Souvenir> getSouvenirByName(String soName) {
        return mapper.getSouvenirByName(soName);
    }
}
