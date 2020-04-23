package cn.testrunner.dao;

import cn.testrunner.dto.ArticleListDto;
import cn.testrunner.model.Article;

import java.util.List;

/**
 * @author v_lvjichao
 */
public interface ArticleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    List<ArticleListDto> findAllArticle();

    int deleteById(Integer articleId);
}