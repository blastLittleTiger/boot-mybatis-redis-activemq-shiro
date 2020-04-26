package com.zgy.learn.bootmybatisredisactivemq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Souvenir {
    private Integer soId;
    private String soName;
    /**
     * 产地
     */
    private Integer ctId;
}
