package cn.testrunner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author v_lvjichao
 */
@Controller
public class CategoryController {
    @RequestMapping("/category")
    public String category(Integer type) {
        return "category";
    }
    @RequestMapping("/add-category")
    public String addArticle() {
        return "add-category";
    }

    @RequestMapping("/update-category")
    public String updateArticle() {
        return "update-category";
    }
}
