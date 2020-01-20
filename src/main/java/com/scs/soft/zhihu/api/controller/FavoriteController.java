package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.FavoriteService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author  weizhewu
 **/
@RestController
@RequestMapping(value = "/api/favorite")
public class FavoriteController {
    @Resource
    private FavoriteService favoriteService;

    @GetMapping(value = "/recent")
    public Result getRecent(){
        return favoriteService.selectRecent();
    }

    @GetMapping(value = "/all")
    public Result getAll(){
        return favoriteService.selectAll();
    }
}