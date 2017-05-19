package com.mmall.controller.portal;

import com.github.pagehelper.PageInfo;
import com.mmall.common.Const;
import com.mmall.common.ResponseCode;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Shipping;
import com.mmall.pojo.User;
import com.mmall.service.IShippingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by geely
 */

@Controller
@Api(value = "/shipping", description = "【Web C端】 用户收货地址相关操作")
@RequestMapping("/shipping")
public class ShippingController {


    @Autowired
    private IShippingService iShippingService;

    @ApiOperation(value = "添加收货地址")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "receiverName", value = "收货人", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "receiverPhone", value = "电话", required = false, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "receiverMobile", value = "手机", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "receiverProvince", value = "省", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "receiverCity", value = "市", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "receiverDistrict", value = "区", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "receiverAddress", value = "具体地址", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "receiverZip", value = "邮编", required =false, dataType = "String",paramType="query")})
    @RequestMapping(value ="/add.do",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ServerResponse add(HttpSession session,Shipping shipping){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return iShippingService.add(user.getId(),shipping);
    }

    @ApiOperation(value = "删除收货地址")
    @ApiImplicitParam(name = "shippingId", value = "收货地址id", required = true, dataType = "int",paramType="query")
    @RequestMapping(value="/del.do",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ServerResponse del(HttpSession session,Integer shippingId){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return iShippingService.del(user.getId(),shippingId);
    }
    @ApiOperation(value = "添加收货地址")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "receiverName", value = "收货人", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "receiverPhone", value = "电话", required = false, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "receiverMobile", value = "手机", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "receiverProvince", value = "省", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "receiverCity", value = "市", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "receiverDistrict", value = "区", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "receiverAddress", value = "具体地址", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "receiverZip", value = "邮编", required =false, dataType = "String",paramType="query")})
    @RequestMapping(value="/update.do",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ServerResponse update(HttpSession session,Shipping shipping){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return iShippingService.update(user.getId(),shipping);
    }


    @ApiOperation(value = "查询收货地址")
    @ApiImplicitParam(name = "shippingId", value = "收货地址id", required = true, dataType = "int",paramType="query")
    @RequestMapping(value="/select.do",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ServerResponse<Shipping> select(HttpSession session,Integer shippingId){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return iShippingService.select(user.getId(),shippingId);
    }

    @ApiOperation(value = "查询收货地址列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条目数量", required = false, dataType = "int",paramType="query")})
    @RequestMapping(value="/list.do",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ServerResponse<PageInfo> list(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                         @RequestParam(value = "pageSize",defaultValue = "10")int pageSize,
                                         HttpSession session){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return iShippingService.list(user.getId(),pageNum,pageSize);
    }














}
