package cn.testrunner.controller;

import cn.testrunner.model.Category;
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
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/category")
    public ModelAndView Category() {
        List<Category> categoryList = categoryService.findAllCategory();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("categoryList", categoryList);
        modelAndView.setViewName("category");
        return modelAndView;
    }

    @RequestMapping("/add-category")
    public String addCategory() {
        return "add-category";
    }

    @RequestMapping("/update-category")
    public String updateCategory() {
        return "update-category";
    }

    @RequestMapping("/category/add")
    public String add(Category category) {
        Integer id = categoryService.save(category);
        return "category";
    }
}
