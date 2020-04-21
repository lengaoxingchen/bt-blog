package cn.testrunner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author v_lvjichao
 */
@Controller
public class NoticeController {
    @RequestMapping("/notice")
    public String tags() {
        return "notice";
    }
}
