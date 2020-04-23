package cn.testrunner.service;

import cn.testrunner.dto.ArticleListDto;
import cn.testrunner.model.Article;

import java.util.List;

/**
 * @author v_lvjichao
 */
public interface ArticleService {


    /**
     * 新建文章
     * @param article 文章实体
     * @return 文章id
     */
    int save(Article article);


    /**
     * 修改文章
     * @param article 文章实体
     * @return 文章id
     */
    int update(Article article);

    /**
     * 删除文章
     * @param articleId 文章id
     * @return 成功或者失败
     */
    int delete(Integer articleId);

    /**
     * 获取所有的文章列表
     * @return
     */
    List<ArticleListDto> findAllArticle();

    Article findArticleById(Integer id);
}
