package cn.testrunner.model;

import java.io.Serializable;
import lombok.Data;

/**
 * article
 * @author 
 */
@Data
public class Article implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章关键字
     */
    private String keywords;

    /**
     * 文章描述
     */
    private String describe;

    /**
     * 文章所属类目Id
     */
    private Integer categoryId;

    /**
     * 文章标签
     */
    private String tags;

    /**
     * 标题图片
     */
    private String titlePic;

    /**
     * 是否公开  0：公开  1：加密
     */
    private Integer visibility;

    /**
     * 发布时间
     */
    private String time;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 是否删除 0:未删除  1:正常
     */
    private Integer isDel;

    private static final long serialVersionUID = 1L;
}