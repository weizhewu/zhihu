package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Columns;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author weizhewu
 * @date 2020/1/19 16:10
 */
public interface ColumnsMapper {
    /**
     * 获取关注人数最多前四条专栏
     * @return List<Columns>
     */
    @Select("SELECT * FROM t_columns ORDER BY followers DESC LIMIT 0,4 ")
    List<Columns> getTopColumns();

    /**
     * 获取所有的专栏
     * @return List<Columns>
     */
    @Select("SELECT * FROM t_columns")
    List<Columns> getAllColumns();
}
