package cn.zzuli.app02.service;

import cn.zzuli.app02.bean.Article;

import java.util.List;

public interface IArticleService {
    List<Article> findAll();

    Article findById(Long id);

    void save(Article article);

    void deleteById(Long id);

    void update(Article article);
}
