package com.mmall.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;

/**
 * Created by akku on 2017/5/26.
 * 无页面转发到首页
 */
@Controller
@ApiIgnore
@RequestMapping("/re")
public class HomepageController{
    @RequestMapping("/{page}")
    public String checkLogin(@PathVariable("page")String page){
        return "redirect:/c/index.html";
    }

    @RequestMapping("/hp")
    public String toHomePage(){
        return "redirect:/c/index.html";
    }
}
