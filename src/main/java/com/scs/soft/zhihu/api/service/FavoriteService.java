package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.entity.Favorite;

import java.util.List;
import java.util.Map;

/**
 * @author  weizhewu
 **/
public interface FavoriteService {
    /**
     * 查询所有"收藏"
     * @return List<Map>
     */
    Result selectAll();

    /**
     * 查询最新“收藏”
     * @return List<RoundTable>
     */
    Result selectRecent();
}
