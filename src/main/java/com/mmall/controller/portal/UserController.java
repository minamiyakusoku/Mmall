package com.mmall.controller.portal;

import com.mmall.common.Const;
import com.mmall.common.ResponseCode;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import com.mmall.service.IUserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by geely
 */
@Controller
@Api(value = "/user", description = "【Web C端】 用户相关操作")
@RequestMapping("/user")
public class UserController {


    @Autowired
    private IUserService iUserService;


    /**
     * 用户登录
     * @param username
     * @param password
     * @param session
     * @return
     */
    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    @ApiOperation(value = "登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String",paramType="query")})
    @ResponseBody
    public ServerResponse<User> login(String username, String password, HttpSession session){
        ServerResponse<User> response = iUserService.login(username,password);
        if(response.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return response;
    }

    @RequestMapping(value = "/logout.do",method = RequestMethod.POST)
    @ApiOperation(value = "注销")
    @ResponseBody
    public ServerResponse<String> logout(HttpSession session){
        session.removeAttribute(Const.CURRENT_USER);
        return ServerResponse.createBySuccess();
    }

    @ApiOperation(value = "注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "email", value = "邮箱", required = false, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "question", value = "密保问题", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "answer", value = "密保答案", required = true, dataType = "String",paramType="query")})
    @RequestMapping(value = "/register.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> register( User user){
        return iUserService.register(user);
    }

    @ApiOperation(value = "账号/邮箱可用检测")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "str", value = "账号或邮箱", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "type", value = "类型（username/email）", required = true, dataType = "String",paramType="query",
                    examples = @Example({
                            @ExampleProperty(mediaType = "a",value = "username"),
                            @ExampleProperty(value = "email")
                    }))})
    @RequestMapping(value = "check_valid.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> checkValid(String str,String type){
        return iUserService.checkValid(str,type);
    }

    @ApiOperation(value = "获取当前登录的用户信息(来自session)")
    @RequestMapping(value = "/get_user_info.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> getUserInfo(HttpSession session){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if(user != null){
            return ServerResponse.createBySuccess(user);
        }
        return ServerResponse.createByErrorMessage("用户未登录,无法获取当前用户的信息");
    }



    @ApiOperation(value = "获取指定用户密保问题")
    @ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "String",paramType="query")
    @RequestMapping(value = "/forget_get_question.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> forgetGetQuestion(String username){
        return iUserService.selectQuestion(username);
    }

    @ApiOperation(value = "验证密保答案")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "question", value = "问题", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "answer", value = "答案", required = true, dataType = "String",paramType="query")})
    @RequestMapping(value = "/forget_check_answer.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> forgetCheckAnswer(String username,String question,String answer){
        return iUserService.checkAnswer(username,question,answer);
    }

    @ApiOperation(value = "重置密码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "passwordNew", value = "新密码", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "forgetToken", value = "密保验证成功返回的token", required = true, dataType = "String",paramType="query")})
    @RequestMapping(value = "/forget_reset_password.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> forgetRestPassword(String username,String passwordNew,String forgetToken){
        return iUserService.forgetResetPassword(username,passwordNew,forgetToken);
    }


    @ApiOperation(value = "修改密码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "passwordOld", value = "旧密码", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "passwordNew", value = "新密码", required = true, dataType = "String",paramType="query")})
    @RequestMapping(value = "/reset_password.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> resetPassword(HttpSession session,String passwordOld,String passwordNew){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorMessage("用户未登录");
        }
        return iUserService.resetPassword(passwordOld,passwordNew,user);
    }

    @ApiOperation(value = "修改当前用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "email", value = "邮箱", required = false, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "question", value = "密保问题", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "answer", value = "密保答案", required = true, dataType = "String",paramType="query")})
    @RequestMapping(value = "/update_information.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> update_information(HttpSession session,User user){
        User currentUser = (User)session.getAttribute(Const.CURRENT_USER);
        if(currentUser == null){
            return ServerResponse.createByErrorMessage("用户未登录");
        }
        user.setId(currentUser.getId());
        user.setUsername(currentUser.getUsername());
        ServerResponse<User> response = iUserService.updateInformation(user);
        if(response.isSuccess()){
            response.getData().setUsername(currentUser.getUsername());
            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return response;
    }
    @ApiOperation(value = "调取当前登录的用户信息")
    @RequestMapping(value = "/get_information.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> get_information(HttpSession session){
        User currentUser = (User)session.getAttribute(Const.CURRENT_USER);
        if(currentUser == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"未登录,需要强制登录status=10");
        }
        return iUserService.getInformation(currentUser.getId());
    }






























}
