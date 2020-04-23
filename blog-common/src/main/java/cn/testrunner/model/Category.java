package cn.testrunner.model;

import java.io.Serializable;
import lombok.Data;

/**
 * category
 * @author 
 */
@Data
public class Category implements Serializable {
    /**
     * 主键id

     */
    private Integer id;

    /**
     * 类目名称
     */
    private String name;

    /**
     * 项目别名
     */
    private String alias;

    /**
     * 父节点id
     */
    private Integer fid;

    /**
     * 类目关键字
     */
    private String keywords;

    /**
     * 类目描述
     */
    private String describe;

    /**
     * 是否可用 0：可用 1：删除
     */
    private Integer isDel;

    private static final long serialVersionUID = 1L;
}