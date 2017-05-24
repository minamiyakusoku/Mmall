package com.mmall.controller.page;

import com.mmall.common.Const;
import com.mmall.common.ResponseCode;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import com.mmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;

/**
 * Created by akku on 2017/5/18.
 * 页面访问权限管理Controller
 */
@Controller
@ApiIgnore
@RequestMapping("/")
public class PageController {
    @Autowired
    IUserService iUserService;

    @RequestMapping("/{page}.html")
    public ModelAndView page(@PathVariable("page")String page){
        System.out.println("---------------------------->"+page);
        return new ModelAndView("client/"+page+".html");
    }

    @RequestMapping("/client/{page}.html")
    public ModelAndView privateUserPage(@PathVariable("page")String page, HttpSession session){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user==null) {
            return new ModelAndView("client/index.html");
        } else {
            return new ModelAndView("client/" + page + ".html");
        }
    }

    @RequestMapping("/supervisor/{page}.html")
    public ModelAndView privateAdminPage(@PathVariable("page")String page, HttpSession session){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return new ModelAndView("client/index.html");
        }
        if(!iUserService.checkAdminRole(user).isSuccess()){
            return new ModelAndView("client/index.html");
        }else{
            return  new ModelAndView("client/"+page+".html");
        }
    }
}
