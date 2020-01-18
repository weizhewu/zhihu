package com.scs.soft.zhihu.api.service;


import com.scs.soft.zhihu.api.common.Result;


/**
 * @author weizhewu
 */
public interface RoundTableService {

    /**
     * 获取所有圆桌
     * @return Result
     */
    Result getAll();

    /**
     * 最受欢迎的四条圆桌内容
     * @return Result
     */
    Result getPopular();
}
