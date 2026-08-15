package com.tl.module2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 注解，将类标记为控制器
public class AddController {

    @RequestMapping("/add") // 映射请求路径为/add
    @ResponseBody // 注解，将方法返回值直接写入响应体
    int add(int a, int b){ // 方法参数为a和b，返回值为int
        return a+b;
    }


}
