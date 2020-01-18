package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.RoundTable;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author weizhewu
 *圆桌界面
 */
public interface RoundTableMapper {

    /**
     * 获取所有圆桌
     * @return List<RoundTable>
     */
    @Select("SELECT * FROM t_round_table")
    List<RoundTable> getAll();

    /**
     * 最受欢迎的四条圆桌内容
     * @return List<RoundTable>
     */
    @Select("SELECT * FROM t_round_table ORDER BY visits_count DESC LIMIT 0,4")
    List<RoundTable> getPopular();

}
