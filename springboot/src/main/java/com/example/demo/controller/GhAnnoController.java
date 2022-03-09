package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.entity.GhAnno;
import com.example.demo.mapper.GhAnnoMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/gh_anno")
public class GhAnnoController {

    // 不规范，controller引入service service里引入mapper 这里直接controller引入mapper
    @Resource
    GhAnnoMapper ghAnnoMapper;


    @PostMapping
    public Result<?> save(@RequestBody GhAnno ghAnno){
        ghAnnoMapper.insert(ghAnno);
        return Result.success(ghAnno);
    }
}
