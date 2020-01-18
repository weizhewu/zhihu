package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.common.ResultCode;
import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.mapper.RoundTableMapper;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wiezhewu
 * @date 2020.1.15
 */
@Service
public class RoundTableServiceImpl implements RoundTableService {

    @Resource
    private RoundTableMapper roundTableMapper;
    @Override
    public Result getAll() {
        List<RoundTable> roundTableList= roundTableMapper.getAll();
        if (roundTableList.size()<=0){
            return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
        }
        return Result.success(roundTableList);
    }

    @Override
    public Result getPopular() {
        List<RoundTable> roundTableList= roundTableMapper.getPopular();
        if (roundTableList.size()<=0){
            return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
        }
        return Result.success(roundTableList);
    }
}
