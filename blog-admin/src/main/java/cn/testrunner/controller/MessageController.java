package cn.testrunner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author v_lvjichao
 */
@Controller
public class MessageController {
    @RequestMapping("/message")
    public String message(){
        return "message";
    }
}
