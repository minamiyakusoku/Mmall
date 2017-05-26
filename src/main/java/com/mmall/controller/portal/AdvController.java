package com.mmall.controller.portal;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.service.IAdvService;
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

/**
 * Created by akku on 2017/5/22.
 */
@Controller
@Api(value = "/adv", description = "【Web C端】 广告相关操作")
@RequestMapping("/adv")
public class AdvController {
    @Autowired
    IAdvService iAdvService;


    @ApiOperation(value = "获取全部广告信息",notes = "如果categoryId不为空或0，跳转到对应商品分类的商品列表页面；如果productId不为空或0，跳转到对应的商品详情页面；否则根据pageUrl跳转页面")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条目数量", required = false, dataType = "int",paramType="query")})
    @RequestMapping(value = "/list.do",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ServerResponse<PageInfo> list(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                           @RequestParam(value = "pageSize",defaultValue = "10") int pageSize) {
        return iAdvService.getAll(pageNum,pageSize);
    }



    @ApiOperation(value = "获取广告（多条件可排序查询）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "广告标题（模糊查询）", required = false, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "content", value = "广告标题或副标题（模糊查询）", required = false, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "position", value = "广告位置（目前只有1，为首页轮播广告）", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "status", value = "广告状态（1启用，0被禁用）", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条目数量", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "orderBy", value = "排序属性（create_time#desc,create_time#asc,position#desc,position#asc）", required = false, dataType = "int",paramType="query")})
    @RequestMapping(value = "/list_by.do",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ServerResponse<PageInfo> listBy(@RequestParam(value = "title",required = false) String title,
                                                   @RequestParam(value = "content",required = false) String content,
                                                   @RequestParam(value = "position",required = false) Integer position,
                                                   @RequestParam(value = "status",required = false) Integer status,
                                                   @RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                           @RequestParam(value = "pageSize",defaultValue = "10") int pageSize,
                                           @RequestParam(value = "orderBy",defaultValue = "") String orderBy) {
        return iAdvService.list(title,content,position,status,pageNum,pageSize,orderBy);
    }

}
