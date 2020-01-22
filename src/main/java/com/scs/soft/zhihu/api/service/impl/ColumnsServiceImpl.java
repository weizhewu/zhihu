package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.common.ResultCode;
import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.mapper.ColumnsMapper;
import com.scs.soft.zhihu.api.service.ColumnsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author weizhewu
 * @date 2020/1/21 12:11
 */
@Service
public class ColumnsServiceImpl implements ColumnsService {
    @Resource
    private ColumnsMapper columnsMapper;

    @Override
    public Result getTopColumns() {
        List<Columns> columnsList = columnsMapper.getTopColumns();
        if (columnsList.size() <= 0){
            return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
        }else {
            return Result.success(columnsList);
        }
    }

    @Override
    public Result getAllColumns() {
        List<Columns> columnsList = columnsMapper.getAllColumns();
        if (columnsList.size() <= 0){
            return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
        }else {
            return Result.success(columnsList);
        }
    }
}
