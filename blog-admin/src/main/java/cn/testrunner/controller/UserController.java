package cn.testrunner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author v_lvjichao
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/add")
    public String addUser(){
        return "";
    }
}
