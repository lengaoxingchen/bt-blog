package cn.testrunner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommentController {

    @RequestMapping("/comment")
    public String comment(){
        return "comment";
    }
}
