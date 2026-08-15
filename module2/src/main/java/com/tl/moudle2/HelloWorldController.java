package com.tl.moudle2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  // 注解，将类标记为控制器
public class HelloWorldController {  // 控制器类

    @RequestMapping("/hello")  // 映射请求路径为/hello
    @ResponseBody  // 注解，将方法返回值直接写入响应体
    String hi(){
        return "Hello World";
    }



}
