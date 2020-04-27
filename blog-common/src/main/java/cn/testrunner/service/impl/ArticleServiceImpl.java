package cn.testrunner.service.impl;

import cn.testrunner.dao.ArticleDao;
import cn.testrunner.dto.ArticleListDto;
import cn.testrunner.model.Article;
import cn.testrunner.service.ArticleService;
import cn.testrunner.utils.DateFormatUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author v_lvjichao
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;

    @Override
    public int save(Article article) {
        article.setTime(DateFormatUtil.timeStamp2Date(DateFormatUtil.timeStamp(), null));
        return articleDao.insertSelective(article);
    }

    @Override
    public int update(Article article) {
        return articleDao.updateByPrimaryKeySelective(article);
    }

    @Override
    public int delete(Integer articleId) {
        return articleDao.deleteById(articleId);
    }

    @Override
    public PageInfo<ArticleListDto> findAllArticle(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);

        List<ArticleListDto> articleListDtoList = articleDao.findAllArticle();
        return new PageInfo<ArticleListDto>(articleListDtoList);
    }

    @Override
    public Article findArticleById(Integer id) {
        return articleDao.selectByPrimaryKey(id);
    }
}
