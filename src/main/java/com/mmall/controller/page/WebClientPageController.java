package com.mmall.controller.page;

import com.mmall.common.Const;
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
@RequestMapping("/c")
public class WebClientPageController {
    @Autowired
    IUserService iUserService;

    @RequestMapping("/{page}.html")
    public ModelAndView checkLogin(@PathVariable("page")String page, HttpSession session){

        User user = (User)session.getAttribute(Const.CURRENT_USER);
        boolean flag = false;
        switch (page){
            case"index":
            case"login":
            case"commodityDetils":
            case"product-list":
            case"register":
            case"reset-msg":
            case"reset-pass":
            case"reset-password":
            case"reset-verify":
            case"service":
                flag = true;
                break;
            default:
                if(user!=null) {
                    flag =true;
                }
                break;
        }

        System.out.println(">>>>【page:"+page+"】【user:"+user+"】"+"【flag:"+flag+"】  <<<<");
        if(user!=null)
            System.out.println("【username:"+user.getUsername() +"】");

        if(flag){return new ModelAndView("web_client/" + page + ".html");}
        else{return new ModelAndView("web_client/login.html");}


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
