package com.mmall.controller.portal;

import com.mmall.common.ServerResponse;
import com.mmall.service.ICategoryService;
import com.mmall.service.IUserService;
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
@Api(value = "/category", description = "【Web C端】 商品类目相关操作")
@RequestMapping("/category")
public class CategoryController {


    @Autowired
    private IUserService iUserService;

    @Autowired
    private ICategoryService iCategoryService;






    @ApiOperation(value = "获取指定类目下的全部类目详情（无递归）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "categoryId", value = "类目Id（默认查询一级类目）", required = false, dataType = "int",paramType="query")})
    @RequestMapping(value = "/get_category.do",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ServerResponse getChildrenParallelCategory(HttpSession session,@RequestParam(value = "categoryId" ,defaultValue = "0") Integer categoryId){

        return iCategoryService.getChildrenParallelCategory(categoryId);

    }


    @ApiOperation(value = "获取指定类目下的全部子类目id（递归）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "categoryId", value = "类目Id（默认查询一级类目）", required = false, dataType = "int",paramType="query")})
    @RequestMapping(value = "/get_deep_category.do",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ServerResponse getCategoryAndDeepChildrenCategory(HttpSession session,@RequestParam(value = "categoryId" ,defaultValue = "0") Integer categoryId){

        return iCategoryService.selectCategoryAndChildrenById(categoryId);


    }








}
