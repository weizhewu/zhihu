package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.common.ResultCode;
import com.scs.soft.zhihu.api.entity.Favorite;
import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.mapper.FavoriteMapper;

import com.scs.soft.zhihu.api.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName FavoriteServiceImpl
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/1/20
 **/
@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Resource
    private FavoriteMapper favoriteMapper;
    @Override
    public Result selectAll() {
        List<Favorite> favoriteList= favoriteMapper.selectAll();
        if (favoriteList.size()<=0){
            return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
        }
        return Result.success(favoriteList);
    }

    @Override
    public Result selectRecent() {
        List<Favorite> favoriteList= favoriteMapper.selectRecent();
        if (favoriteList.size()<=0){
            return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
        }
        return Result.success(favoriteList);
    }
}