package com.mmall.controller.portal;

import com.mmall.common.ServerResponse;
import com.mmall.service.IMallConfigService;
import com.mmall.vo.MallConfigVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by akku on 2017/5/26.
 */
@Controller
@Api(value = "/mallconfig", description = "商城配置信息相关操作")
@RequestMapping("/mallconfig")
public class MallConfigController {
    @Autowired
    IMallConfigService iMallConfigService;

    @ApiOperation(value = "获取配置信息")
    @RequestMapping(value="/info.do",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ServerResponse<MallConfigVo> info(){
        return iMallConfigService.info();
    }

}
