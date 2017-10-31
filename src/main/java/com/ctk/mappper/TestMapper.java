package com.ctk.mappper;

import org.apache.ibatis.annotations.*;

/**
 * Created by Administrator on 2017/10/31 0031.
 */
@Mapper
public interface TestMapper {

    @Select("insert into tb_test(sex) value(#{sex})")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "sex", column = "sex")
    })
    Boolean addSex(@Param("sex") String sex);
}
