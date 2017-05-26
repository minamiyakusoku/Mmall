package com.mmall.controller.portal;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.service.IProductService;
import com.mmall.vo.ProductDetailVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by geely
 */
@Controller
@Api(value = "/product", description = "【Web C端】 商品相关操作" )
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService iProductService;


    @ApiOperation(value = "获取商品详细信息", notes = "根据商品id来获取商品详细信息")
    @ApiImplicitParam(name = "productId", value = "商品id", required = true, dataType = "int",paramType="query")
    @RequestMapping(value = "/detail.do",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ServerResponse<ProductDetailVo> detail(Integer productId){
        return iProductService.getProductDetail(productId);
    }



    @ApiOperation(value = "根据关键字或商品类型查询商品详细信息", notes = "多条件查询（keyword和categoryId至少选择一个）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "keyword", value = "关键字", required = false, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "categoryId", value = "商品类型ID", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条目数量", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "orderBy", value = "排序属性(price#desc,price#asc)", required = false, dataType = "String",paramType="query")})
    @RequestMapping(value = "/list.do",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ServerResponse<PageInfo> list(@RequestParam(value = "keyword",required = false)String keyword,
                                         @RequestParam(value = "categoryId",required = false)Integer categoryId,
                                         @RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                         @RequestParam(value = "pageSize",defaultValue = "10") int pageSize,
                                         @RequestParam(value = "orderBy",defaultValue = "") String orderBy){
        return iProductService.getProductByKeywordCategory(keyword,categoryId,pageNum,pageSize,orderBy);
    }





}
