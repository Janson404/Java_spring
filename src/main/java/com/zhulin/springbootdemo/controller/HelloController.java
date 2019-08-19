package com.zhulin.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Janson
 * @version 1.0
 * @date 2019/8/19 12:00
 */
@Controller //识别扫描当前的类，并作为一个bean去管理
public class HelloController {
    @GetMapping("/hello")
//    请求参数
    public String hello(@RequestParam(name = "name" ) String name, Model model) {
        model.addAttribute("name", name);
        return "hello";

    }
}
