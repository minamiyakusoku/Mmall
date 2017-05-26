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
    /**
     * 获取全部
     * @return
     */
    List<Adv> getAll();

    /**
     * 多条件查询
     * @param title 广告标题
     * @param titleAndSubtitle 广告标题或广告副标题
     * @param position 广告置放位置
     * @param status 广告启用状态
     * @return
     */
    List<Adv> list(@Param("title")String title, @Param("titleAndSubtitle")String titleAndSubtitle, @Param("position")Integer position, @Param("status")Integer status);

    Adv get(Integer id);

    Integer delete(Integer id);

    Integer insert(Adv record);

    Integer updateById(Adv record);

}
