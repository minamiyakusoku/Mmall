package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Adv;
import com.mmall.vo.AdvDetailVo;
import com.mmall.vo.AdvListVo;

import java.util.List;

/**
 * Created by akku on 2017/5/22.
 */
public interface IAdvService {
    ServerResponse<PageInfo> getAll(int pageNum,int pageSize);

    ServerResponse<PageInfo> list(String title,String content,Integer position,Integer status,int pageNum,int pageSize,String orderBy);

    ServerResponse<AdvDetailVo> get(Integer id);

    ServerResponse delete(Integer id);

    ServerResponse insert(Adv record);

    ServerResponse updateById(Adv record);
}
