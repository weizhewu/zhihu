package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.common.Result;

/**
 * @author weizhewu
 * @date 2020/1/21 12:08
 */
public interface ColumnsService {
    /**
     * 查询关注量最高的前四条
     * @return Result
     */
    Result getTopColumns();

    /**
     * 获取所有的专题栏
     * @return Result
     */
    Result getAllColumns();
}
