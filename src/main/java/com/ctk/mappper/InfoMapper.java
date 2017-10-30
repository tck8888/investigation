package com.ctk.mappper;

import com.ctk.InfoBean;
import org.apache.ibatis.annotations.*;

import javax.sound.sampled.Line;
import java.util.List;

/**
 * Created by tck on 2017/10/30.
 */
@Mapper
public interface InfoMapper {
    @Insert("insert into tb_study(sex,grade,major,playGame,playGameName," +
            "playGameTime,playGameAdvantages," +
            "playGameWorth,playGameLocation,playGameReason) " +
            "values (#{sex},#{grade},#{major}," +
            "#{playGame},#{playGameName},#{playGameTime},#{playGameAdvantages}," +
            "#{playGameWorth},#{playGameLocation},#{playGameReason})")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "grade", column = "grade"),
            @Result(property = "major", column = "major"),
            @Result(property = "playGame", column = "playGame"),
            @Result(property = "playGameName", column = "playGameName"),
            @Result(property = "playGameTime", column = "playGameTime"),
            @Result(property = "playGameAdvantages", column = "playGameAdvantages"),
            @Result(property = "playGameWorth", column = "playGameWorth"),
            @Result(property = "playGameLocation", column = "playGameLocation"),
            @Result(property = "playGameReason", column = "playGameReason")
    })
    Boolean addInfo(@Param("sex") String sex,@Param("grade") String grade,
                    @Param("major") String major,@Param("playGame") String playGame,
                    @Param("playGameName") String playGameName,@Param("playGameTime") String playGameTime,
                    @Param("playGameAdvantages") String playGameAdvantages,@Param("playGameWorth") String playGameWorth,
                    @Param("playGameLocation") String playGameLocation,@Param("playGameReason") String playGameReason);

    @Select("SELECT *FROM tb_study")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "grade", column = "grade"),
            @Result(property = "major", column = "major"),
            @Result(property = "playGame", column = "playGame"),
            @Result(property = "playGameName", column = "playGameName"),
            @Result(property = "playGameTime", column = "playGameTime"),
            @Result(property = "playGameAdvantages", column = "playGameAdvantages"),
            @Result(property = "playGameWorth", column = "playGameWorth"),
            @Result(property = "playGameLocation", column = "playGameLocation"),
            @Result(property = "playGameReason", column = "playGameReason")
    })
    List<InfoBean> getAllInfo();
}
