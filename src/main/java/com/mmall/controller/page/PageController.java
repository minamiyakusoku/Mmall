package com.mmall.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by akku on 2017/5/18.
 */
@Controller
@RequestMapping("/page")
public class PageController {
    @RequestMapping("/test")
    public ModelAndView test(){
        return new ModelAndView("web_client/test");
    }
}
