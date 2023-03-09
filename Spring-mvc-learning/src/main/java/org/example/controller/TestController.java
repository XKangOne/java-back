package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * @description:
 * @author: yk
 * @date:
 * @param:
 * @return:
 **/
@Controller
public class TestController {
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "Hello test";
    }
}
