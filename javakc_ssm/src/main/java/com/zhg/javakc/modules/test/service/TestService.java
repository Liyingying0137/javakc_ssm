package com.zhg.javakc.modules.test.service;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.test.dao.TestDao;
import com.zhg.javakc.modules.test.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService extends BaseService<TestDao, TestEntity> {
    @Autowired
    TestDao testDao;
    /**
     * 查询
     */
    public Page<TestEntity> query(TestEntity testEntity,Page<TestEntity> page){
        testEntity.setPage(page);
        List<TestEntity> list=testDao.findList(testEntity);
        page.setList(list);
        return page;

    }
}
