package org.example.controller;

import org.example.entity.LoginUser;
import org.example.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    /* 向用户列表页面跳转*/
    @RequestMapping("/toUser")
    public String selectUsers() {
        return "user";
    }

    /* 接收批量删除用户的方法*/
    @RequestMapping("/deleteUsers")
    public String deleteUsers(Integer[] ids) {
        if (ids != null) {
            for (Integer id : ids) {
                System.out.println("删除了id为" + id + "的用户!");
            }
        } else {
            System.out.println("ids=null");
        }
        return "success";
    }

    /*向用户批量修改页面跳转*/
    @RequestMapping("/toUserEdit")
    public String toUserEdit() {
        return "user_edit";
    }

    /* 接收批量修改用户的方法*/
    @RequestMapping("/editUsers")
    public String editUsers(UserVo userList) {
        //将所有用户数据封装到集合中
        List<LoginUser> users = userList.getUsers();
        //循环输出所有用户信息
        for (LoginUser user : users) {
            //如果接收的用户id不为空，则表示对该用户进行了修改
            if (user.getId() != null) {
                System.out.println("修改了id为" + user.getId() + "的用户名为:" + user.getUsername());
            }
        }
        return "success";
    }
}
