package cn.testrunner.service;

import cn.testrunner.model.Category;

import java.util.List;

public interface CategoryService {
    Integer save(Category category);

    List<Category> findAllCategory();
}
