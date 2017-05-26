package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Adv;
import com.mmall.vo.AdvDetailVo;

import java.util.List;

/**
 * Created by akku on 2017/5/22.
 * 广告相关业务
 */
public interface IAdvService {
    /**
     * 获取全部广告
     * @param pageNum
     * @param pageSize
     * @return
     */
    ServerResponse<PageInfo> getAll(int pageNum,int pageSize);

    /**
     * 多条件查询广告
     * @param title 广告标题
     * @param content 广告内容
     * @param position 广告置放位置
     * @param status 广告启用状态
     * @param pageNum
     * @param pageSize
     * @param orderBy 排序依据
     * @return
     */
    ServerResponse<PageInfo> list(String title,String content,Integer position,Integer status,int pageNum,int pageSize,String orderBy);

    /**
     * 根据Id获取广告
     * @param id
     * @return
     */
    ServerResponse<AdvDetailVo> get(Integer id);

    ServerResponse delete(Integer id);

    ServerResponse insert(Adv record);

    ServerResponse updateById(Adv record);
}
