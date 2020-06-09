package cn.zzuli.app02.service.impl;

import cn.zzuli.app02.bean.Article;
import cn.zzuli.app02.dao.ArticleMapper;
import cn.zzuli.app02.service.IArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleServiceImpl implements IArticleService {


    @Resource
    private ArticleMapper articleMapper;

    @Override
    public Article findById(Long id) {
        return articleMapper.selectById(id);
    }

    @Override
    public List<Article> findAll() {
        return articleMapper.selectAll();
    }

    @Override
    public void save(Article article) {
        articleMapper.insert(article);
    }

    @Override
    public void deleteById(Long id) {
        articleMapper.deleteById(id);
    }

    @Override
    public void update(Article article) {
        articleMapper.update(article);
    }
}
