package cn.testrunner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReadersController {
    @RequestMapping("/readers")
    public String readers() {
        return "readers";
    }
}
