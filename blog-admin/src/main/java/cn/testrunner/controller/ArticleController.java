package cn.testrunner.controller;

import cn.testrunner.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author v_lvjichao
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/article")
    public String article() {
        return "article";
    }

    @RequestMapping("/add-article")
    public String addArticle() {
        return "add-article";
    }

    @RequestMapping("/update-article")
    public String updateArticle() {
        return "update-article";
    }

    @RequestMapping("/article/add")
    public String add(Article article) {
        Integer id = articleService.save(article);
        return "article";
    }
}
