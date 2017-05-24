package com.mmall.controller.backend;

import com.mmall.common.Const;
import com.mmall.common.ResponseCode;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Adv;
import com.mmall.pojo.User;
import com.mmall.service.IAdvService;
import com.mmall.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by akku on 2017/5/23.
 */
@Controller
@Api(value = "/manage/adv", description = "【Web 管理端】 广告相关操作")
@RequestMapping("/manage/adv")
public class AdvManageController {
    @Autowired
    IAdvService iAdvService;
    @Autowired
    IUserService iUserService;

    @ApiOperation(value = "添加广告")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "广告标题", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "subtitle", value = "广告副标题", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "categoryId", value = "广告对应的商品类目Id", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "productId", value = "广告对应的商品id", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "pageUrl", value = "广告对应的页面链接url", required = false, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "mainImage", value = "广告主图", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "subImages", value = "广告全部图片", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "position", value = "广告位置", required = true, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "status", value = "广告启用状态", required = true, dataType = "int",paramType="query")})
    @RequestMapping(value ="/save.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse add(HttpSession session,Adv adv){

        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登录,请登录管理员");

        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            //填充我们增加产品的业务逻辑
            return iAdvService.insert(adv);
        }else{
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }

    @ApiOperation(value = "修改广告信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "广告id", required = true, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "title", value = "广告标题", required = false, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "subtitle", value = "广告副标题", required = false, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "categoryId", value = "广告对应的商品类目Id", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "productId", value = "广告对应的商品id", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "pageUrl", value = "广告对应的页面链接url", required = false, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "mainImage", value = "广告主图", required = false, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "subImages", value = "广告全部图片", required = false, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "position", value = "广告位置", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "status", value = "广告启用状态", required = false, dataType = "int",paramType="query")})
    @RequestMapping(value ="/update.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse update(HttpSession session,Adv adv){

        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登录,请登录管理员");

        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            //填充我们增加产品的业务逻辑
            return iAdvService.updateById(adv);
        }else{
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }
}
