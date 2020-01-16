package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Special;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author weizhewu
 * @date 2020.1.15
 */
public interface SpecialService {
    /**
     * 查询所有专辑
     * @return List<Map>
     */
    List<Map> selectAll();

    /**
     * 查询最新专辑
     * @return List<Special>
     */
    List<Special> selectRecent();
}
