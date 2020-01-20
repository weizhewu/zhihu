package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Favorite;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author  weizhewu
 **/
public interface FavoriteMapper {
    /**
     * 查询展示前四个收藏卡片
     * @return List<Favorite>
     */
    @Select("SELECT * FROM t_favorite ORDER BY id LIMIT 0,4")
    List<Favorite> selectRecent();

    /**
     * 查询所有收藏内容
     * @return List<Map>
     */
    @Select("SELECT * FROM t_favorite")
    List<Favorite> selectAll();
}
