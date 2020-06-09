package cn.zzuli.app02.web.controller;


import cn.zzuli.app02.bean.Article;
import cn.zzuli.app02.dao.ArticleMapper;
import cn.zzuli.app02.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @GetMapping("findAll")
    public List<Article> findAll() {
        return articleService.findAll();
    }

    @GetMapping("findById")
    public Article findById(Long id) {
        return articleService.findById(id);
    }

    @GetMapping("deleteById")
    public String deleteById(Long id) {
        articleService.deleteById(id);
        return "删除成功";
    }

    @PostMapping("save")
    public String save(Article article) {
        articleService.save(article);
        return "保存成功";
    }

    @PostMapping("update")
    public String update(Article article) {
        articleService.update(article);
        return "修改成功";
    }


}
