package com.mmall.dao;

import com.mmall.pojo.Adv;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by akku on 2017/5/22.
 */
@Repository
public interface AdvMapper {
    List<Adv> getAll();

    List<Adv> getByPosition(Integer position);

    Adv get(Integer id);

    Integer delete(Integer id);

    Integer insert(Adv record);

    Integer updateById(Adv record);

}
