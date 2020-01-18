package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author weizhewu
 */
@RestController
@RequestMapping(value = "/api/roundTable")
public class RoundTableController {

    @Resource
    private RoundTableService roundTableService;

    /**
     * 获取所有圆桌
     * @return Result
     */
    @GetMapping(value = "/all")
    public Result getAll(){
        return roundTableService.getAll();
    }

    /**
     * 获取最受欢迎的四条圆桌
     * @return  Result
     */
    @GetMapping(value = "/popular")
    public Result getPopular(){
        return roundTableService.getPopular();
    }

}
