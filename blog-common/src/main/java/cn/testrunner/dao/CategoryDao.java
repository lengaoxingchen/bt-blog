package cn.testrunner.dao;

import cn.testrunner.model.Category;
import com.baomidou.mybatisplus.annotation.SqlParser;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface CategoryDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    @Select("select * from category where is_del=0 and fid=0")
    List<Category> findAllCategory();
}