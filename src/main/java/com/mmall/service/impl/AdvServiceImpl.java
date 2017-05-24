package com.mmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.mmall.common.Const;
import com.mmall.common.ResponseCode;
import com.mmall.common.ServerResponse;
import com.mmall.dao.AdvMapper;
import com.mmall.pojo.Adv;
import com.mmall.service.IAdvService;
import com.mmall.util.DateTimeUtil;
import com.mmall.util.PropertiesUtil;
import com.mmall.vo.AdvDetailVo;
import com.mmall.vo.AdvListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by akku on 2017/5/22.
 */
@Service("iAdvService")
public class AdvServiceImpl implements IAdvService {
    @Autowired
    private AdvMapper advMapper;


    @Override
    public ServerResponse<PageInfo> getAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Adv> advList = advMapper.getAll();

        List<AdvListVo> advListVoList = Lists.newArrayList();
        for(Adv adv : advList){
            AdvListVo advListVo = assembleAdvListVo(adv);
            advListVoList.add(advListVo);
        }
        PageInfo pageResult = new PageInfo(advList);
        pageResult.setList(advListVoList);
        return ServerResponse.createBySuccess(pageResult);
    }

    @Override
    public ServerResponse<PageInfo> getByPosition(Integer position, int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        List<Adv> advList = advMapper.getByPosition(position);

        List<AdvListVo> advListVoList = Lists.newArrayList();
        for(Adv adv : advList){
            AdvListVo advListVo = assembleAdvListVo(adv);
            advListVoList.add(advListVo);
        }
        PageInfo pageResult = new PageInfo(advList);
        pageResult.setList(advListVoList);
        return ServerResponse.createBySuccess(pageResult);
    }

    @Override
    public ServerResponse<AdvDetailVo> get(Integer id) {
        if(id == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }
        Adv adv = advMapper.get(id);
        if(adv == null){
            return ServerResponse.createByErrorMessage("广告已下架或者删除");
        }
        if(adv.getStatus() != Const.AdvStatusEnum.ON.getCode()){
            return ServerResponse.createByErrorMessage("广告已下架或者删除");
        }
        AdvDetailVo advDetailVo = assembleAdvDetailVo(adv);
        return ServerResponse.createBySuccess(advDetailVo);
    }

    @Override
    public ServerResponse delete(Integer id) {

        int rowCount = advMapper.delete(id);
        if(rowCount > 0){
            return ServerResponse.createBySuccess("删除广告成功");
        }
        return ServerResponse.createByErrorMessage("删除广告失败");
    }

    @Override
    public ServerResponse insert(Adv record) {


        int rowCount = advMapper.insert(record);
        if(rowCount > 0){
            return ServerResponse.createBySuccess("添加广告成功");
        }
        return ServerResponse.createByErrorMessage("添加广告失败");
    }

    @Override
    public ServerResponse updateById(Adv record) {

        int rowCount = advMapper.updateById(record);
        if(rowCount > 0){
            return ServerResponse.createBySuccess("修改广告成功");
        }
        return ServerResponse.createByErrorMessage("修改广告失败");
    }

    private AdvDetailVo assembleAdvDetailVo(Adv adv){
        AdvDetailVo advDetailVo = new AdvDetailVo();
        advDetailVo.setId(adv.getId());
        advDetailVo.setTitle(adv.getTitle());
        advDetailVo.setSubtitle(adv.getSubtitle());
        advDetailVo.setCategoryId(adv.getCategoryId());
        advDetailVo.setProductId(adv.getProductId());
        advDetailVo.setPageUrl(adv.getPageUrl());
        advDetailVo.setMainImage(adv.getMainImage());
        advDetailVo.setSubImages(adv.getSubImages());
        advDetailVo.setPosition(adv.getPosition());
        advDetailVo.setStatus(adv.getStatus());
        advDetailVo.setImageHost(PropertiesUtil.getProperty("ftp.server.http.prefix","http://img.happymmall.com/"));



        advDetailVo.setCreateTime(DateTimeUtil.dateToStr(adv.getCreateTime()));
        advDetailVo.setUpdateTime(DateTimeUtil.dateToStr(adv.getUpdateTime()));
        return advDetailVo;
    }

    private AdvListVo assembleAdvListVo(Adv adv){
        AdvListVo advListVo = new AdvListVo();
        advListVo.setId(adv.getId());
        advListVo.setTitle(adv.getTitle());
        advListVo.setSubtitle(adv.getSubtitle());
        advListVo.setCategoryId(adv.getCategoryId());
        advListVo.setProductId(adv.getProductId());
        advListVo.setPageUrl(adv.getPageUrl());
        advListVo.setMainImage(adv.getMainImage());
        advListVo.setPosition(adv.getPosition());
        advListVo.setStatus(adv.getStatus());
        advListVo.setImageHost(PropertiesUtil.getProperty("ftp.server.http.prefix","http://img.happymmall.com/"));



        return advListVo;
    }
}
