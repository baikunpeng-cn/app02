package cn.zzuli.app02.dao;

import cn.zzuli.app02.bean.Article;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ArticleMapper {
    @Results({
            @Result(property = "publishTime", column = "publish_time"),
            @Result(property = "readTime", column = "read_time"),
            @Result(property = "thumbUp", column = "thumb_up"),
            @Result(property = "thumbDown", column = "thumb_down")
    })

    @Select("select * from cms_article")
    List<Article> selectAll();

    @Select("select * from cms_article where id=#{id}")
    Article selectById(Long id);

    @Delete("delete from cms_article where id=#{id}")
    void deleteById(Long id);

    @Insert("insert into cms_article(title,publish_time,content) values(#{title},#{publishTime},#{content}) ")
    void insert(Article article);

    @Update("update cms_article set title=#{title},publish_time=#{publishTime},content=#{content} where id=#{id}")
    void update(Article article);

}
