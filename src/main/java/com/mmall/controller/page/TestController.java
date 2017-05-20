package com.mmall.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by akku on 2017/5/18.
 * 测试用Controller
 */
@Controller
@ApiIgnore
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/test")
    public ModelAndView test(){
        return new ModelAndView("web_client/test");
    }
}
