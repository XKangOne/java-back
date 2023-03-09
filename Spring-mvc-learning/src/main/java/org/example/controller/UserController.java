package org.example.controller;

import org.example.entity.LoginUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * @description:
 * @author: yk
 **/
@Controller
public class UserController {
    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }
    /***
     * @description 接收用户注册信息
    */
    @RequestMapping("/registerUser")
    public String registerUser(LoginUser user) {
        String username = user.getUsername();
        String password = user.getPassword();
        System.out.println("username=" + username);
        System.out.println("password=" + password);
        return "success";
    }
}
