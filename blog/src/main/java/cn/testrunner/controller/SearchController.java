package cn.testrunner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author v_lvjichao
 */
@Controller
public class SearchController {
    @RequestMapping("/Search")
    public String search(String keyword){
        return "404";
    }
}
