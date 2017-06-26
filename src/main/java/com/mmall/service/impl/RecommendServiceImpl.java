package com.mmall.service.impl;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.dao.CategoryMapper;
import com.mmall.dao.OrderMapper;
import com.mmall.dao.ProductMapper;
import com.mmall.service.IRecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by akku on 2017/6/26.
 */
@Service("iRecommendService")
public class RecommendServiceImpl implements IRecommendService {

    @Autowired
    //订单数据
    OrderMapper orderMapper;

    @Autowired
    //商品数据
    ProductMapper productMapper;

    @Autowired
    //商品类目数据
    CategoryMapper categoryMapper;

    @Override
    public ServerResponse<PageInfo> getByOnSaleTime(Integer CategoryId, Date beginTime, Date endTime, String orderBy, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public ServerResponse<PageInfo> getBySalesVolume(Integer CategoryId, Date beginTime, Date endTime, String orderBy, int pageNum, int pageSize) {
        return null;
    }
}
