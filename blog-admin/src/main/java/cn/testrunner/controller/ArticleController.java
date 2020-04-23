package cn.testrunner.controller;

import cn.testrunner.dto.ArticleListDto;
import cn.testrunner.model.Article;
import cn.testrunner.model.Category;
import cn.testrunner.service.ArticleService;
import cn.testrunner.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author v_lvjichao
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/article")
    public ModelAndView article() {
        List<ArticleListDto> articleList = articleService.findAllArticle();
        ModelAndView mv = new ModelAndView();
        mv.addObject("articleList", articleList);
        mv.setViewName("article");
        return mv;
    }

    @RequestMapping("/add-article")
    public String addArticle() {
        return "add-article";
    }

    @RequestMapping("/update-article")
    public ModelAndView updateArticle(Integer id) {
        Article article = articleService.findArticleById(id);
        ModelAndView mv = new ModelAndView();
        List<Category> categoryList = categoryService.findAllCategory();
        mv.addObject("article", article);
        mv.addObject("categoryList", categoryList);
        mv.addObject("update-article");
        return mv;
    }

    @RequestMapping("/article/add")
    public String add(Article article) {
        Integer id = articleService.save(article);
        return "redirect:/article";
    }
    @RequestMapping("/article/update")
    public String update(Article article) {
        Integer id = articleService.update(article);
        return "redirect:/article";
    }

    @RequestMapping("/article/delete")
    public ModelAndView delete(Integer id){
        Integer count = articleService.delete(id);
        List<ArticleListDto> articleList = articleService.findAllArticle();
        ModelAndView mv = new ModelAndView();
        mv.addObject("articleList", articleList);
        mv.setViewName("article");
        return mv;
    }
}
