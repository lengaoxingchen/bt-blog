package cn.testrunner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author v_lvjichao
 */
@Controller
public class FlinkController {

    @RequestMapping("/flink")
    public String links() {
        return "flink";
    }

    @RequestMapping("/add-flink")
    public String addArticle() {
        return "add-flink";
    }

    @RequestMapping("/update-flink")
    public String updateArticle() {
        return "update-flink";
    }
}
