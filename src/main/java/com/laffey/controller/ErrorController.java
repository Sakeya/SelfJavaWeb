package com.laffey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by laffey on 2018/1/24.
 */
@Controller
@RequestMapping(path = "/error")
public class ErrorController {
    @RequestMapping(path = "/404")
    public String page404() {
        return "error/page404";
    }

    @RequestMapping(path = "/500")
    public String page500() {
        return "error/page500";
    }
}
