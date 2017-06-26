package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;

import java.util.Date;

/**
 * Created by akku on 2017/6/26.
 */
public interface IRecommendService {
    /**
     * 根据上架时间推荐
     * @param CategoryId 类目
     * @param beginTime 开始时间
     * @param endTime 结束时间
     * @param orderBy 排序方式
     * @param pageNum
     * @param pageSize
     * @return
     */
    ServerResponse<PageInfo> getByOnSaleTime(Integer CategoryId,Date beginTime,Date endTime,String orderBy,int pageNum, int pageSize);

    /**
     * 根据销量推荐
     * @param CategoryId 类目
     * @param beginTime 开始时间
     * @param endTime 结束时间
     * @param orderBy 排序方式
     * @param pageNum
     * @param pageSize
     * @return
     */
    ServerResponse<PageInfo> getBySalesVolume(Integer CategoryId,Date beginTime,Date endTime,String orderBy,int pageNum, int pageSize);
}
