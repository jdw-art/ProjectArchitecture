package com.macro.mall.malltinymybatis.test;

import com.github.pagehelper.PageInfo;
import com.macro.mall.malltinymybatis.dao.UmsResourceCategoryDao;
import com.macro.mall.malltinymybatis.dao.UmsResourceDao;
import com.macro.mall.malltinymybatis.domain.UmsResourceCategoryExt;
import com.macro.mall.malltinymybatis.domain.UmsResourceExt;
import com.macro.mall.malltinymybatis.model.UmsResource;
import com.macro.mall.malltinymybatis.service.UmsResourceService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/3 17:08
 * @Version: 1.0
 */
@SpringBootTest
public class MyBatisAdvanceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyBatisAdvanceTest.class);

    @Autowired
    private UmsResourceDao umsResourceDao;

    @Autowired
    private UmsResourceCategoryDao umsResourceCategoryDao;

    @Autowired
    private UmsResourceService umsResourceService;

    @Test
    void testOneToOne(){
        UmsResourceExt umsResourceExt = umsResourceDao.selectResourceWithCategory(1L);
        LOGGER.info("testOneToOne category={}",umsResourceExt.getCategory());
    }

    @Test
    void testAssociation(){
        UmsResourceExt umsResourceExt = umsResourceDao.selectResourceWithCategory2(1L);
        LOGGER.info("testAssociation category={}",umsResourceExt.getCategory());
    }

    @Test
    void testOneAndMany(){
        List<UmsResource> umsResourceList = umsResourceDao.selectListByCategoryId(1L);
        LOGGER.info("testAssociation category={}",umsResourceList);
    }

    @Test
    void testOneToMany(){
        UmsResourceCategoryExt umsResourceCategoryExt = umsResourceCategoryDao.selectCategoryWithResource(1L);
        LOGGER.info("testOneToMany resourceList={}",umsResourceCategoryExt.getResourceList());
    }

    @Test
    void testPage() {
        int pageNum = 1;
        int pageSize = 5;
        PageInfo<UmsResource> pageInfo = umsResourceService.page(pageNum, pageSize, 1L);
        LOGGER.info("testPage total={},pages={},resourceList={}", pageInfo.getTotal(), pageInfo.getPages(), pageInfo.getList());
    }


}
