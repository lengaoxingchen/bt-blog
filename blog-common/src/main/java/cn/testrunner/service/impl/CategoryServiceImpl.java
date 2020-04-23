package cn.testrunner.service.impl;

import cn.testrunner.dao.CategoryDao;
import cn.testrunner.model.Category;
import cn.testrunner.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author v_lvjichao
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Integer save(Category category) {
        return categoryDao.insertSelective(category);
    }

    @Override
    public List<Category> findAllCategory() {
        return categoryDao.findAllCategory();
    }
}
