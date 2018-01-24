package com.laffey.controller;

import com.google.gson.Gson;
import com.laffey.common.JsonContentTypeView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by laffey on 2018/1/24.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public ModelAndView hello() {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("spring", "spring mvc");
//        mv.setViewName("hello");
//        return mv;

        Map<String, Object> model = new HashMap<String, Object>();
        Gson gson = new Gson();
        model.put("hello", "spring mvc");
//        System.out.println(model);
        return new ModelAndView(new JsonContentTypeView(gson.toJson(model)));
    }
}
