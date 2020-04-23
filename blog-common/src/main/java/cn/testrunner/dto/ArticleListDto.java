package cn.testrunner.dto;

import lombok.Data;

/**
 * 管理后端文章列表dto
 *
 * @author v_lvjichao
 */
@Data
public class ArticleListDto {
    Integer id;
    String title;
    String category;
    String tags;
    Integer commentCount = 0;
    String time;
}
