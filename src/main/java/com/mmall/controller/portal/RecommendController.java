package com.mmall.controller.portal;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.service.IRecommendService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by akku on 2017/6/26.
 */
@Controller
@Api(value = "/recommend", description = "【Web C端】 推荐相关操作" )
@RequestMapping("/recommend")
public class RecommendController {
    @Autowired
    IRecommendService recommendService;
    /**
     * 商品推荐方式
     */
    enum ProductRecommendMode{
        //上架时间
        ON_SALE_TIME,
        //根据销量
        SALES_VOLUME
    }

    @ApiOperation(value = "根据关键字或商品类型查询商品详细信息", notes = "多条件查询（keyword和categoryId至少选择一个）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "mode", value = "商品推荐方式", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = false, dataType = "int",paramType="query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条目数量", required = false, dataType = "int",paramType="query")})
    @RequestMapping(value = "/product_recommend.do",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ServerResponse<PageInfo> list(@RequestParam(value = "pageNum",defaultValue = "1") String mode,
                                         @RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                         @RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        //注意做参数合法判断，保证传参合理性
        ProductRecommendMode productRecommendMode = null;
        productRecommendMode= ProductRecommendMode.valueOf(mode.toUpperCase().trim());

        //根据调用方要求返回对应的商品推荐
        switch (productRecommendMode){
            case ON_SALE_TIME:
                return recommendService.getByOnSaleTime(null,null,null,null,pageNum,pageSize);
            case SALES_VOLUME:
                return recommendService.getBySalesVolume(null,null,null,null,pageNum,pageSize);
            default:
                return null;
        }
    }
}
