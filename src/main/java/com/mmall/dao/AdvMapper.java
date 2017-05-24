package com.mmall.dao;

import com.mmall.pojo.Adv;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by akku on 2017/5/22.
 */
@Repository
public interface AdvMapper {
    List<Adv> getAll();

    List<Adv> list(@Param("title")String title, @Param("titleAndSubtitle")String titleAndSubtitle, @Param("position")Integer position, @Param("status")Integer status);

    Adv get(Integer id);

    Integer delete(Integer id);

    Integer insert(Adv record);

    Integer updateById(Adv record);

}
