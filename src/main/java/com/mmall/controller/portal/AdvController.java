package com.mmall.controller.portal;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.service.IAdvService;
import com.mmall.vo.AdvListVo;
import com.mmall.vo.ProductDetailVo;
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


    @ApiOperation(value = "获取全部广告信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条目数量", required = false, dataType = "int",paramType="query")})
    @RequestMapping(value = "/list.do",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ServerResponse<PageInfo> list(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                           @RequestParam(value = "pageSize",defaultValue = "10") int pageSize) {
        return iAdvService.getAll(pageNum,pageSize);
    }



    @ApiOperation(value = "根据广告位置获取全部广告信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "position", value = "广告位置", required = true, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条目数量", required = false, dataType = "int",paramType="query")})
    @RequestMapping(value = "/list_by_position.do",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ServerResponse<PageInfo> listByPosition(Integer position,
                                                   @RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                           @RequestParam(value = "pageSize",defaultValue = "10") int pageSize) {
        return iAdvService.getByPosition(position,pageNum,pageSize);
    }

}
