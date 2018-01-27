package com.laffey.controller;

import com.google.gson.Gson;
import com.laffey.common.JsonContentTypeView;
import com.laffey.model.Userinfo;
import com.laffey.model.UserinfoWithBLOBs;
import com.laffey.service.impl.UserInfoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by laffey on 2018/1/24.
 */
@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Resource
    private UserInfoServiceImpl userInfoService;

    @RequestMapping(path = "/index")
    public String index(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "/login/login";
    }

    @RequestMapping(path = "/mainPage")
    public String main(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "/main";
    }

    @RequestMapping(path = "/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> model = new HashMap<String, Object>();
        Gson gson = new Gson();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (!"root".equals(username) || !"root".equals(password)) {
            model.put("result", "fail");
        } else
            model.put("result", "success");
        return new ModelAndView(new JsonContentTypeView(gson.toJson(model)));
    }

    @RequestMapping(path = "/getUser")
    public void getUser(HttpServletRequest request, HttpServletResponse response) throws Exception{
        Map<String,Object> model = request.getParameterMap();
        int userId;
        if (model.containsKey("user_id"))
            userId = Integer.parseInt((String) model.get("user_id"));
        else
            userId = 0;

        Userinfo userinfoWithBLOBs = userInfoService.getUserInfoById(userId);

        response.getWriter().write(new Gson().toJson(userinfoWithBLOBs));
    }

    @RequestMapping(path = "/addUser")
    public void addUser(HttpServletRequest request, HttpServletResponse response) throws Exception{
        Map<String,Object> model = request.getParameterMap();
        UserinfoWithBLOBs userinfoWithBLOBs=new UserinfoWithBLOBs();
        if (model.containsKey("age"))
            userinfoWithBLOBs.setAge((String) model.get("age"));
        else
            userinfoWithBLOBs.setAge("0");

        if (model.containsKey("avatar"))
            userinfoWithBLOBs.setAvatar((String) model.get("avatar"));
        else
            userinfoWithBLOBs.setAvatar("");

        if (model.containsKey("desc"))
            userinfoWithBLOBs.setDescription((String) model.get("desc"));
        else
            userinfoWithBLOBs.setDescription("");

        if (model.containsKey("gender"))
            userinfoWithBLOBs.setGender((Boolean) model.get("gender"));
        else
            userinfoWithBLOBs.setGender(false);

        if (model.containsKey("name"))
            userinfoWithBLOBs.setName((String) model.get("name"));
        else
            userinfoWithBLOBs.setName("name");
        response.setStatus(userInfoService.AddUserInfo(userinfoWithBLOBs));

        response.getWriter().write("{\"status\":0,\"message\":\"success\"}");
//        Gson gson = new Gson();
//        return new ModelAndView(new JsonContentTypeView(gson.toJson(userinfoWithBLOBs)));
    }
}
