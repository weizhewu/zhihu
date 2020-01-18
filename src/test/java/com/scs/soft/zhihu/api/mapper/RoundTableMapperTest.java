package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.RoundTable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = ZhihuApiApplication.class)
class RoundTableMapperTest {

    @Resource
    private RoundTableMapper roundTableMapper;

    @Test
    void getAll() {
        List<RoundTable> roundTables = roundTableMapper.getAll();
        roundTables.forEach(System.out::println);
    }

    @Test
    void getPopular() {
        List<RoundTable> roundTables = roundTableMapper.getPopular();
//        roundTables.forEach(System.out::println);
        for (RoundTable roundTable:roundTables){
            System.out.println(roundTable.getVisitsCount());
        }
    }
}