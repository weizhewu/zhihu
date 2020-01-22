package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.ColumnsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author weizhewu
 * @date 2020/1/21 13:26
 */
@RestController
@RequestMapping(value = "/api/columns")
public class ColumnsController {
    @Resource
    private ColumnsService columnsService;

    /**
     * 获取关注量最多的四条专栏
     * @return Result
     */
    @GetMapping(value = "/topColumns")
    public Result getTopColumns(){
        return columnsService.getTopColumns();
    }

    /**
     * 获取所有的专栏
     * @return result
     */
    @GetMapping(value = "/all")
    public Result getAllColumns(){
        return columnsService.getAllColumns();
    }
}
